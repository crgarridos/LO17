import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Lexique {
	
	protected Map<String, String> lexique;
	
	public Lexique(String filePath){
		this.lexique = new HashMap<String, String>();
		
		Scanner scanner;
		try {
			scanner = new Scanner(new File(filePath));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return;
		}
		
		// On boucle sur chaque champ detecté
		while (scanner.hasNextLine()) {
		    String line = scanner.nextLine();
		 
		    System.out.println(line);
		    StringTokenizer st = new StringTokenizer(line, "\t");
		    if(st.countTokens() == 2){
		    	String mot = st.nextToken();
		    	String lemme = st.nextToken();
		    	this.lexique.put(mot, lemme);
		    }
		}
		
		scanner.close();
	}

	public String retrouve(String mot){
		if(lexique.containsKey(mot)){
			return lexique.get(mot);
		}
		
		return null;
	}

	public String[] levenshtein(String m1,String m2) {
//		LevenshteinDistance(m A , m B )
//			for i ← 0 to |m A |
//				do dist[i, 0] = dist[i − 1, 0] + γ(X i , λ)
//			for j ← 0 to |m B |
//				do dist[0, j] = dist[0, j − 1] + γ(λ, Y i )
//			for i ← 1 to |m A |
//				do for j ← 1 to |m B |
//					do d 1 = dist[i − 1, j − 1) + γ(X i , Y i )
//						d 2 = dist[i − 1, j] + γ(X i , λ)
//						d 3 = dist[i, j − 1] + γ(λ, Y j )
//						dist[i, j] = min(d 1 , d 2 , d 3 )
//			return dist[|m A |, |m B |]
		int[][] dist = new int[m1.length()][m2.length()];
		for (int i = 0; i < m1.length(); i++)
			dist[i][0] = dist[i-1][0] + cout(1);
		for (int j = 0; j < m1.length(); j++)
			dist[0][j] = dist[0][j-1] + cout(1);
		for (int i = 0; i < m1.length(); i++) {
			for (int j = 0; j < m1.length(); j++) {
				int d1 = dist[i-1][j-1] + cout(1);
				int d2 = dist[i-1][j-1] + cout(1);
				int d3 = dist[i-1][j-1] + cout(1);
				dist[0][j] = dist[0][j-1] + cout(1);
			}
		}
		return null;
	}

	private int cout(int i) {
		// TODO Stub de la méthode généré automatiquement
		return 0;
	}
	
	
	
}
