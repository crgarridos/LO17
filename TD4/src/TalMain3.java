import java.io.StringReader;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import tal.tal_sqlLexer;
import tal.tal_sqlParser;

public class TalMain3 {
	
	private static final String path_lexique = "filtreCorpus_30_03_2015.txt";
	private static final String path_stoplist = "stoplist.txt";
	private static final String path_poids = "poidsLemmes.txt";

	
	// je veux tous les articles qui parlent de aero
	// Je voudrais les articles dont le titre contient le mot chimie. 
	public static void main(String args[]) {
				
		Lexique lex = new Lexique(path_lexique, path_poids);
		Stoplist stoplist = new Stoplist(path_stoplist);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Texte : ");
		String s = scanner.nextLine();	
		System.out.println(s);
		while (!s.equals("*")) {
			
			String stoppedSentence = stoplist.stop(s);
			System.out.println("stopped: "+stoppedSentence);
			
			String sanitizedSentence = "";
			
			StringTokenizer st = new StringTokenizer(stoppedSentence," ");
			int i = 0;
			while(st.hasMoreElements()){
				String mot = (String) st.nextElement();
	
				mot = mot.toLowerCase();
				int index = i++;
				System.out.println(index);
				String lemme = lex.retrouve(mot);
				if(lemme != null){
					System.out.println("Mot retrouvé: "+mot+", lemme="+lemme);
					sanitizedSentence+=lemme+" ";
				}else{
					//System.out.println("Mot non trouvé, calcul prefixe ...");
					Map<String, Integer> candidatsPrefixe = lex.prefixe(mot, 60, index);
					Map<String, Integer> candidatsLeven = lex.levenshtein(mot,index);
					
					sanitizedSentence+= lex.comparePrefixeLevensthein(candidatsPrefixe, candidatsLeven)+" ";
					
					/*if(!candidats.isEmpty()){
						for(String lemme_candidat : candidats){
							//System.out.println("Lemme prefix candidat: "+lemme_candidat);
						}
						sanitizedSentence+=candidats.get(0)+" ";
					}
					else{
						//System.out.println("Echec du prefixe, calcul lenvenshein ...");
						
	
						if(!candidatsLeven.isEmpty()){
							for(String candidat : candidatsLeven.keySet()){
								System.out.println("Lemme Leven candidat: "+candidat + " - score: " + candidatsLeven.get(candidat));
							}
							sanitizedSentence+=candidatsLeven.keySet().toArray()[0]+" ";
						}
						else{
							System.out.println("Echéc du levenshtein, Aucun mot trouvé");
						}
					}*/
					//String[] candidats = lex.levenshtein(mot);
				}
			}
			
			System.out.println("sanitized= "+sanitizedSentence);
			
			try {
				tal_sqlLexer lexer = new tal_sqlLexer(
						new ANTLRReaderStream(new StringReader(sanitizedSentence)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				tal_sqlParser parser = new tal_sqlParser(tokens);
				String arbre = parser.listerequetes();
				System.out.println("Arbre SQL: "+arbre);
				
				RequeteSQL rq = new RequeteSQL(fixSQL(arbre));
				System.out.println("ResultSet:");
				System.out.println(rq.getOutputString());
				rq.close();
			} catch (Exception e) {
			}
			System.out.print("Texte : ");
			s = scanner.nextLine();
		}
		scanner.close();
	}


	private static String fixSQL(String arbre) {
		String result = arbre.replaceAll("count (.+) from","count(distinct $1) from");
		return result;
	}
}
