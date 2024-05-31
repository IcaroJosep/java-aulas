import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Principal {
/*
	assim como arrayliste linkedList tbm é uma inplementacao da
	interface list portanto posui todos seu metodos 
	oq faz com q suas inplementacaos sejao parecidas
 */
	public static void main(String[] args) {
			//chamando pela interface list e inplementando como linked
			List<String> listaNome = new LinkedList<>();
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
