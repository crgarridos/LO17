import java.util.Scanner;
import java.util.StringTokenizer;




public class Main {
	private static final String path_lexique = "lexique.txt";

	public static void main(String[] args) {
		Lexique lex = new Lexique(path_lexique);
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreElements()){
			String mot = (String) st.nextElement();
			String lemme = lex.retrouve(mot.toLowerCase());
//			if(lemme)
//			String[] candidats = lex.levenshtein(mot);
		}
	}
}
