import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
			dist[i][0] = dist[i-1][0] + coutLevenshein(m1.charAt(i-1),null);
			
		for (int j = 1; j <= m2.length(); j++)
			dist[0][j] = dist[0][j-1] + coutLevenshein(null,m2.charAt(j-1));
			
		for (int i = 1; i <= m1.length(); i++) {
			for (int j = 1; j <= m2.length(); j++) {
				int d1 = dist[i-1][j-1] + coutLevenshein(m1.charAt(i-1),m2.charAt(j-1));
				int d2 = dist[i-1][j] + coutLevenshein(m1.charAt(i-1),null);
				int d3 = dist[i][j-1] + coutLevenshein(null,m2.charAt(j-1));
				
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

	private int coutLevenshein(Character x, Character y) {
		if(x == null || y == null)
			return 1;
		else if(!x.equals(y))
			return 2;
		else return 0;
	}
	
	public  HashMap<String, Integer> levenshtein(String mot){
		HashMap<String,Integer> hash = new HashMap<String,Integer>(); 
		
		int lengthMin = 3;
		if(mot.length() < lengthMin) return hash;
		
		int seuil = mot.length()*75/100;
		for(String cle : lexique.keySet()){
			if(cle.length() < lengthMin)
				continue;
			int prox = levenshteinDistance(mot, cle);		   
			if(prox <= seuil){// && prox >= seuil/2){
			   String valeur = (String) lexique.get(cle);
			   hash.put(valeur,prox);
			}
		}
		hash = sortMotsByProx(hash);
		
//		List<String> mots = new ArrayList<>(hash.keySet()); 
//		List<Integer> proxs = new ArrayList<>(hash.values()); 
//		
//		for (int i = 0; i < proxs.size(); i++) {
//			for (int j = 0; j < proxs.size(); j++) {
//				if(proxs.get(i) < proxs.get(j)){
//					int p = proxs.get(i);
//					proxs.set(i,proxs.get(j));
//					proxs.set(j,p);
//					String m = mots.get(i);
//					mots.set(i,mots.get(j));
//					mots.set(j,m);
//				}
//			}
//		}
//		
//		
//		HashMap<String, Integer> newHash = new HashMap<String, Integer>();
//		for (int i = 0; i < mots.size(); i++)
//			newHash.put(mots.get(i), proxs.get(i));
//		
		
		HashMap<String,Integer> uniques = new HashMap<String,Integer>();
		for(Entry<String, Integer> entry : hash.entrySet()) {		
		    if(!uniques.containsKey(entry.getKey()))
				uniques.put(entry.getKey(),entry.getValue());
		}
		return uniques;
	}	
	
	private HashMap<String, Integer> sortMotsByProx(final HashMap<String, Integer> hash) {
		List<String> mots = new ArrayList<>(hash.keySet()); 
		List<Integer> proxs = new ArrayList<>(hash.values()); 
		
		for (int i = 0; i < proxs.size(); i++) {
			for (int j = 0; j < proxs.size(); j++) {
				if(proxs.get(i) < proxs.get(j)){
					int p = proxs.get(i);
					proxs.set(i,proxs.get(j));
					proxs.set(j,p);
					String m = mots.get(i);
					mots.set(i,mots.get(j));
					mots.set(j,m);
				}
			}
		}
		HashMap<String, Integer> newHash = new HashMap<String, Integer>();
//		for (int i = 0; i < mots.size(); i++)
//			newHash.put(mots.get(i), proxs.get(i));

		Iterator<String> i1 = mots.iterator();
		Iterator<Integer> i2 = proxs.iterator();
		while (i1.hasNext() && i2.hasNext()) {
			newHash.put(i1.next(), i2.next());
		}
		
		return newHash;
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
