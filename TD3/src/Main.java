import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

//TESTER: ilste

public class Main {
	private static final String path_lexique = "filtreCorpus_30_03_2015.txt";

	public static void main(String[] args) {
		Lexique lex = new Lexique(path_lexique);
		System.out.println(lex.levenshteinDistance("cat", "catcat"));
		System.out.println(lex.levenshteinDistance("OSLO", "SNOW"));
		System.out.println(lex.levenshteinDistance("événement", "événmmement"));
		System.out.println(lex.levenshteinDistance("grande", "graned"));
		Scanner in = new Scanner(System.in);
		while(true){
			String s = in.nextLine();
			StringTokenizer st = new StringTokenizer(s," ");
			while(st.hasMoreElements()){
				String mot = (String) st.nextElement();
	
				mot = mot.toLowerCase();
				String lemme = lex.retrouve(mot);
				if(lemme != null){
					System.out.println("Mot retrouvé: "+mot+", lemme="+lemme);
				}else{
					System.out.println("Mot non trouvé, calcul prefixe ...");
					List<String> candidats = lex.prefixe(mot, 60);
					if(!candidats.isEmpty())
						for(String lemme_candidat : candidats){
							System.out.println("Lemme prefix candidat: "+lemme_candidat);
						}
					else{
						System.out.println("Echec du prefixe, calcul lenvenshein ...");
						Map<String, Integer> candidatsLeven = lex.levenshtein(mot);
	
						if(!candidatsLeven.isEmpty())
							for(String candidat : candidatsLeven.keySet()){
								System.out.println("Lemme Leven candidat: "+candidat + " - score: " + candidatsLeven.get(candidat));
							}
						else System.out.println("Echéc du levenshtein, Aucun mot trouvé");
					}
					//String[] candidats = lex.levenshtein(mot);
				}
			}
		}
//		in.close();
	}
}
