import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Principal {
/*	itaretor
  	serve para q vc comsiga iterar 
  	uma lista encadeada(entre outras estruturas)
  	da mesma forma q um vetor
  	a pesar de suas estruturas ser diferentes	

*/

	public static void main(String[] args) {
		
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("icaro");
		listaNome.add("carlos");
		listaNome.add("joao");
		listaNome.add("bruna");
		
	/*//embora o arrayList possa ser interado por for outras colecoes nao podem
	   for(String nome:listaNome) {
			System.out.println(nome);
		}
	*/	
		//as proprias colecoes tem seus iterator dendro delas 
		//e é possivel capturalos
		Iterator<String> iterator = listaNome.iterator();
		
		//hasNext() "ve se tem um proximo elemento"
		while(iterator.hasNext()) {
			//next() "pega o proximo"
			System.out.println(iterator.next());
		}
	
		//COMPAREITOR  com criterio de comparacao de reverter ordem
		Comparator<String> comparator = Collections.reverseOrder();	
		
		//na hora de usar colectoin chamamos o metodo sort
		// o sort exige 2 parametros 
		//(oq se vai comparar) (criterio de comparação)
		Collections.sort(listaNome,comparator);
		
		System.out.println("\nElementos depois da ordenação");
		
		//como o iterado ja avia iterado e a ordem da lista foi mudada
		//é nessesario re-atribuir o iterador
		iterator=listaNome.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
