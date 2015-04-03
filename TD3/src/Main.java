import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;




public class Main {
	private static final String path_lexique = "filtreCorpus_30_03_2015.txt";

	public static void main(String[] args) {
		Lexique lex = new Lexique(path_lexique);
		Scanner in = new Scanner(System.in);
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
				if(candidats.isEmpty())
					System.out.println("Echec du prefixe");
				else
					for(String lemme_candidat : candidats){
						System.out.println("Lemme candidat: "+lemme_candidat);
					}
				//String[] candidats = lex.levenshtein(mot);
			}
		}
		in.close();
	}
}
