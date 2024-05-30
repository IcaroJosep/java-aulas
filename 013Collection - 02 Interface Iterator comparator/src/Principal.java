import java.util.ArrayList;
import java.util.Collections;

public class Principal {
/*



 */
	public static void main(String[] args) {
	
		ArrayList<Produto>s=new ArrayList<>();
		
		s.add(new Produto(123,"blusa",5146));
		s.add(new Produto(85,"capus",967));
		s.add(new Produto(465,"casaco",879));
		s.add(new Produto(321,"camisa",897));
		s.add(new Produto(147,"meias",1000));
		
		System.out.println("lista antes da ordenacao : ");

		for(Produto shop:s) {
			System.out.println(shop.quantidadeEstoque+" "+shop.nomeProduto+" "+shop.codigoProduto);	
		}
		
		System.out.println("\nlista depos da ordenacao: ");
			 			
		Collections.sort(s,new EstoqueComprador());//criterio de compararacao criado na class "EstoqueComprador"
		
		for(Produto shop:s) {
			System.out.println(shop.quantidadeEstoque+" "+shop.nomeProduto+" "+shop.codigoProduto);	
		}
		
	}

}
