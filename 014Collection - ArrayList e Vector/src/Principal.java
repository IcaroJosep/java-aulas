import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
/*
	Vector e ArrayList sao praticamente iguas
	sua diferenca esta em q vector é tread safe
	e Arraylist nao! 
 */

	public static void main(String[] args) {
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("oswaldo");
		listaNome.add("gisele");
		listaNome.add("giovanna");
		listaNome.add("giulianna");
		
		System.out.println("Antes: ");
		
		Iterator<String> it = listaNome.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//set troca o elemento da posicao 1 por jujuba
		listaNome.set(1, "jujuba");
		
		it = listaNome.iterator();
		
		System.out.println("\ndepos: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
        
		
		//remove por indice[1] ou por chamada como foi feito
		listaNome.remove("jujuba");
		
		it = listaNome.iterator();
		
		System.out.println("\nremovido: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
