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
	protected Map<Pair<String, Integer>, Integer> poids;

	
	public Lexique(String filePath, String poidsPath){
		this.lexique = new HashMap<String, String>();
		
		//Lemmes
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
		
		this.poids = new HashMap<Pair<String, Integer>, Integer>();
		
		//Poids des lemmes
		try {
			scanner = new Scanner(new File(poidsPath));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return;
		}
		
		// On boucle sur chaque champ detecté
		while (scanner.hasNextLine()) {
		    String line = scanner.nextLine();
		 
//		    System.out.println(line);
		    StringTokenizer st = new StringTokenizer(line, "\t");
		    if(st.countTokens() == 3){
		    	String lemme = st.nextToken();
		    	Integer index = Integer.parseInt(st.nextToken());
		    	Integer poids = Integer.parseInt(st.nextToken());
		    	this.poids.put(new Pair<String, Integer>(lemme, index), poids);
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

		return dist[m1.length()][m2.length()];
	}

	private int coutLevenshein(Character x, Character y) {
		if(x == null || y == null)
			return 1;
		else if(!x.equals(y))
			return 2;
		else return 0;
	}
	
	public  Map<String, Integer> levenshtein(String mot, int index){
		Map<String,Integer> hash = new HashMap<String,Integer>(); 
		
		int lengthMin = 3;
		if(mot.length() < lengthMin) return hash;
		
		int seuil = mot.length()*75/100;
		for(String cle : lexique.keySet()){
			String lemme = lexique.get(cle);
			
			if(cle.length() < lengthMin)
				continue;
			
			int poids = getPoids(lemme, index);
			int prox = levenshteinDistance(mot, cle) - poids;
			if(prox <= seuil){// && prox >= seuil/2){
			   String valeur = lexique.get(cle);
			   hash.put(valeur,prox);
			}
		}
		
		Map<String,Integer> uniques = new HashMap<String,Integer>();
		for(Entry<String, Integer> entry : hash.entrySet()) {		
		    if(!uniques.containsKey(entry.getKey()))
				uniques.put(entry.getKey(),entry.getValue());
		}
		uniques = SortMapByValue.sortByComparator(uniques, SortMapByValue.ASC);
		return uniques;
	}
	
	public  List<String> prefixe(String mot, int seuil, int index){
		List<String> list = new ArrayList<>();
		
		Iterator<String> it = lexique.keySet().iterator();
		while (it.hasNext()){
		   String cle = it.next();
		   int prox = prox(mot, cle);
		   
		   //if(prox > 0) System.out.println("prox="+prox+" m1="+mot+" m2="+cle);
		   
		   if(prox >= seuil){
			   String valeur = lexique.get(cle);
			   list.add(valeur);
		   }
		}
		
		return list;
	}
	
	private int getPoids(String cle, int index) {
		
		Pair<String, Integer> pair = new Pair<>(cle, index);
		if(poids.containsKey(pair)){
			System.out.println("poids:"+poids.get(pair));
			return poids.get(pair);
		}
		return 0;
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
