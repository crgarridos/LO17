import java.io.StringReader;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

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
		s = s.replaceAll("'"," ");
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
				if(isInteger(mot.substring(0, 1))){
					sanitizedSentence += mot+" ";
				}else{
					String lemme = lex.retrouve(mot);
					if(lemme != null){
						System.out.println("Mot retrouvé: "+mot+", lemme="+lemme);
						sanitizedSentence+=lemme+" ";
					}else{
						Map<String, Integer> candidatsPrefixe = lex.prefixe(mot, 60, index);
						Map<String, Integer> candidatsLeven = lex.levenshtein(mot,index);
						
						sanitizedSentence+= lex.comparePrefixeLevensthein(candidatsPrefixe, candidatsLeven)+" ";
					}
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
				
				RequeteSQL rq = new RequeteSQL(postCompute(arbre));
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
	
	private static String postCompute(String input){
		return fixAllDates(fixSQL(fixParenthesis(input)));
	}
	
	private static String fixParenthesis(String input){
		String result = input.replaceAll("[()]", "").replaceAll("[ \t]+", " ");
		System.out.println("fixParenthesis:" + result);
		return result;
	}

	private static String fixSQL(String arbre) {
		System.out.println("fixSQL");
		String result = arbre.replaceAll("count (.+) from","count(distinct $1) from");
		return result;
	}
	
	private static String fixDate(String arbre){
		System.out.println("fixDate");
		String pattern = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(arbre);

		while (m.find()) {
			String jour = m.group(1);
			String mois = m.group(2);
			String annee = m.group(3);
			System.out.println("Found j: " + jour + " m: " + mois + " a: "+annee);
		}
		String result = arbre;
		return result;
	}
	
	private static String fixAllDates(String arbre) {
		System.out.println("fixAllDates");
		String pattern = "^(.*?)and-between(.*?)$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(arbre);
		String result = "";
		
		while (m.find()) {
			System.out.println("g1:"+m.group(1));
			System.out.println("g2:"+m.group(2));
			result = fixDateBetween(m.group(1), true) + " AND "+ fixDateBetween(m.group(2), false);
		}
		
		System.out.println("fad: "+result);
		
		return result;
	}
	
	private static String fixDateBetween(String arbre, boolean isFirstOne){
		System.out.println("fixDateBetween");
		String result = arbre;
		
		if(isFirstOne){
			result = result.replaceAll("jour = ([0-9]{2}) AND mois = ([0-9]{2}) AND annee = ([0-9]{4})","to_date(jour || '-' || mois || '-' || annee, 'DD-MM-YYYY') BETWEEN to_date('$1-$2-$3', 'DD-MM-YYYY')");
		}else{
			result = result.replaceAll("jour = ([0-9]{2}) AND mois = ([0-9]{2}) AND annee = ([0-9]{4})","to_date('$1-$2-$3', 'DD-MM-YYYY')");
		}
		
		System.out.println("fdb: "+result);
		return result;
	}
	
	private static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
}
