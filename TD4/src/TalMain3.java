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

	/*
	private static final String path_lexique = "../INDEX/LO17/TD4/filtreCorpus_30_03_2015.txt";
	private static final String path_stoplist = "../INDEX/LO17/TD4/stoplist.txt";
	private static final String path_poids = "../INDEX/LO17/TD4/poidsLemmes.txt";
	*/
	private static final String path_lexique = "filtreCorpus_30_03_2015.txt";
	private static final String path_stoplist = "stoplist.txt";
	private static final String path_poids = "poidsLemmes.txt";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Texte : ");
		String s = scanner.nextLine();
		s = s.replaceAll("'", " ");
		System.out.println(s);
		while (!s.equals("*")) {
			transformNaturalToSQL(s);

			System.out.print("Texte : ");
			s = scanner.nextLine();
		}
		scanner.close();
	}

	// je veux tous les articles qui parlent de aero
	// Je voudrais les articles dont le titre contient le mot chimie.
	// je voudrais les articles du 2012
	// je veux tous les articles qui contiennent aero entre 15-04-2015 et
	// 15-06-2015
	public static String transformNaturalToSQL(String s) {
		Lexique lex = new Lexique(path_lexique, path_poids);
		Stoplist stoplist = new Stoplist(path_stoplist);
		
		
			
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
				System.out.println();
				
				return postCompute(arbre);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return "";
			
	}

	private static String postCompute(String input) {
		return fixAllDates(fixSQL(fixParenthesis(input.toLowerCase())));
	}

	private static String fixParenthesis(String input) {
		String result = input.replaceAll("[()]", "").replaceAll("[ \t]+", " ");
		System.out.println("fixParenthesis:" + result);
		return result;
	}

	private static String fixSQL(String arbre) {
		System.out.println("fixSQL");
		String result = arbre.replaceAll("count (.+) from",
				"count(distinct $1) from");
		return result;
	}

	private static String fixDate(String arbre) {
		System.out.println("fixDate");
		String pattern = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(arbre);

		while (m.find()) {
			String jour = m.group(1);
			String mois = m.group(2);
			String annee = m.group(3);
			System.out.println("Found j: " + jour + " m: " + mois + " a: "
					+ annee);
		}
		String result = arbre;
		return result;
	}

	private static String fixAllDates(String arbre) {
		System.out.println("fixAllDates");
		arbre = fixDuplicateWhere(arbre);
		
		String pattern = "^(.*?)and-between(.*?)$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(arbre);
		String result = "";

		while (m.find()) {
			System.out.println("g1:" + m.group(1));
			System.out.println("g2:" + m.group(2));
			result = fixDateBetween(m.group(1), true) + " AND "
					+ fixDateBetween(m.group(2), false);
		}
		result = fixDateNameToNumber(result);
		result = fixDateJoins(result, findMainTable(result));
		System.out.println(result);

		System.out.println("fad: " + result);
		return result;
	}
	private static String fixDuplicateWhere(String arbre) {
		int iFirstWhere = arbre.indexOf("where");
		String s1 =  arbre.substring(0,iFirstWhere+5);
		String s2 = arbre.substring(iFirstWhere+5);
		
		int iSecondWhere = s2.indexOf("where");
		if(iSecondWhere >= 0){
			s2 = s2.replace("where", "and");
			return s1+s2;
		}
		return arbre;
	}
	private static String findMainTable(final String arbre) {
		System.out.println("findMainTable");
		String pattern = "from (.+?) ";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(arbre);
		if (m.find()) {
			System.out.println("found: " + m.group(1));
			return m.group(1);
		}
		return null;
	}

	private static String fixDateBetween(String arbre, boolean isFirstOne) {
		System.out.println("fixDateBetween");
		String result = arbre;

		if (isFirstOne) {
			result = result
					.replaceAll(
							"jour = ([0-9]{2}) and mois = ([0-9]{2}) and annee = ([0-9]{4})",
							"to_date(jour || '-' || mois || '-' || annee, 'DD-MM-YYYY') between to_date('$1-$2-$3', 'DD-MM-YYYY')");
		} else {
			result = result
					.replaceAll(
							"jour = ([0-9]{2}) and mois = ([0-9]{2}) and annee = ([0-9]{4})",
							"to_date('$1-$2-$3', 'DD-MM-YYYY')");
		}

		System.out.println("fdb: " + result);
		return result;
	}

	private static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		// only got here if we didn't return false
		return true;
	}

	final static String[] mois = { "janvier", "février", "mars", "avril",
			"mai", "juin", "juillet", "août", "septembre", "octobre",
			"novembre", "décembre" };

	private static String fixDateNameToNumber(String arbre) {
		System.out.println("fixDateNameToNumber");
		for (int i = 0; i < mois.length; i++) {
			arbre = arbre.replace(mois[i], ((i + 1) < 10 ? "0" + (i + 1)
					: i + 1).toString());// TODO Ceci peut remplacer des
											// ocurrences dans la chaine entier
											// :s
		}
		return arbre;
	}

	// ( select distinct fichier from titretexte where ( ( mot LIKE 'aero%' ) )
	// from date ( jour = 15 jour = 04 annee = 2015 ) and-between ( jour = 15
	// jour = 06 annee = 2015 ) )

	private static String fixDateJoins(String arbre, String table) {
		System.out.println("fixDateJoins");
		String pattern = "^.+(from " + table + ".+from date).+$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(arbre);
		String result = "";

		if (m.find()) {
			System.out.println(m.group(1));
			// System.out.println(m.group(2));
			int iFrom = arbre.indexOf("from");
			arbre = arbre.replace("from " + table + " t", "");
			arbre = arbre.replace("from date", "");
			String s1 = arbre.substring(0, iFrom);
			String s2 = arbre.substring(iFrom);
			String join = " FROM " + table
					+ " t INNER JOIN date d ON t.fichier = d.fichier ";
			result = s1 + join + s2;
		}
		return result;
	}


}
