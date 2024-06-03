import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

/*
*/
	public static void main(String[] args) {
		TreeSet<String> listaNome = new TreeSet<>();
		listaNome.add("Oswaldo");
		listaNome.add("Gisele");
		listaNome.add("Giovanna");
		listaNome.add("Giulianna");
		
		Iterator<String> it = listaNome.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
