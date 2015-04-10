import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
		 
//		    System.out.println(line);
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

	public int levenshteinDistance(String m1,String m2) {
		int[][] dist = new int[m1.length()+1][m2.length()+1];
		dist[0][0]=0;
		for (int i = 1; i <= m1.length(); i++)
			dist[i][0] = dist[i-1][0] + cout(m1.charAt(i-1),null);
			
		for (int j = 1; j <= m2.length(); j++)
			dist[0][j] = dist[0][j-1] + cout(null,m2.charAt(j-1));
			
		for (int i = 1; i <= m1.length(); i++) {
			for (int j = 1; j <= m2.length(); j++) {
				int d1 = dist[i-1][j-1] + cout(m1.charAt(i-1),m2.charAt(j-1));
				int d2 = dist[i-1][j] + cout(m1.charAt(i-1),null);
				int d3 = dist[i][j-1] + cout(null,m2.charAt(j-1));
				
				dist[i][j] = Math.min(Math.min(d1, d2),d3);
			}
		}
//		for (int i = 0; i < m1.length(); i++) {
//			for (int j = 0; j < m2.length(); j++) {
//				System.out.print(dist[i][j]);
//			}
//			System.out.println();
//		}
		return dist[m1.length()][m2.length()];
	}

	private int cout(Character x, Character y) {
		if(x == null || y == null)
			return 1;
		else if(!x.equals(y))
			return 2;
		else return 0;
	}
	
	@SuppressWarnings("unchecked")
	public  List<String> levenshtein(String mot){
		int seuil = mot.length()/2;

		List<String> mots = new ArrayList<>();
		List<Integer> proxs = new ArrayList<>(); 
		
		Iterator<String> it = lexique.keySet().iterator();
		while (it.hasNext()){
		   String cle = (String) it.next();
		   int prox = levenshteinDistance(mot, cle);
		   
		   //if(prox > 0) System.out.println("prox="+prox+" m1="+mot+" m2="+cle);
		   
		   if(prox <= seuil && prox >= seuil/2){
			   String valeur = (String) lexique.get(cle);
			   mots.add(valeur);
			   proxs.add(prox);
		   }
		}
		
		for (int i = 0; i < proxs.size(); i++) {
			for (int j = 0; j < proxs.size(); j++) {
				if(proxs.get(i)<proxs.get(j)){
					int p = proxs.get(i);
					proxs.set(i,proxs.get(j));
					proxs.set(j,p);
					String m = mots.get(i);
					mots.set(i,mots.get(j));
					mots.set(j,m);
				}
			}
		}
		List<String> uniques = new ArrayList<String>();
		for(String s : mots){
			if(!uniques.contains(s))
				uniques.add(s);
		}
		return uniques;
	}	
	
	
	public  List<String> prefixe(String mot, int seuil){
		List<String> list = new ArrayList<>();
		
		Iterator<String> it = lexique.keySet().iterator();
		while (it.hasNext()){
		   String cle = (String) it.next();
		   int prox = prox(mot, cle);
		   
		   //if(prox > 0) System.out.println("prox="+prox+" m1="+mot+" m2="+cle);
		   
		   if(prox >= seuil){
			   String valeur = (String) lexique.get(cle);
			   list.add(valeur);
		   }
		}
		
		return list;
	}
	
	public int prox(String m1, String m2){
		int prox;
		int seuilMin = 3;
		
		if(m1.length() < seuilMin || m2.length() < seuilMin){
			prox = 0;
		}else{
			int i = 0;
			while(i < Math.min(m1.length(), m2.length()) && m1.charAt(i) == m2.charAt(i)){
				++i;
			}
			prox = i * 100 / Math.max(m1.length(), m2.length());
		}
		
		return prox;
	}
}
