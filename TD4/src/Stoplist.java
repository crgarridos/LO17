import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Stoplist extends ArrayList<String>{
	private static final long serialVersionUID = 1L;

	public Stoplist(String stoplist) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(stoplist));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scanner.hasNextLine()) {
		    String line = scanner.nextLine();
		    add(line);
		}
		scanner.close();
	}
	
	public String stop(String s){
		String sstoped = "";
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreElements()){
			String mot = (String) st.nextElement();
			if(this.indexOf(mot)<0)
				sstoped+=" "+mot;
		}
		return sstoped.trim();
	}
}
