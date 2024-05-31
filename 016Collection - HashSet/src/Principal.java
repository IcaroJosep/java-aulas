import java.util.HashSet;

public class Principal {
/* derivado de Set
 	   Set nao pemite dupblicaçao
   
   HashSet	
 		diferente de vetores nao faz o usso de indices[1]
 		utiliza calculos para localizar os elementos de forma mais rapida

 	esta collection permite trabalhar com tabelas
 	hash q sao complecxas com a msm simplicidade 
 	de um vetor		
 */
	public static void main(String[] args) {
	
		HashSet<String> listaNome = new HashSet<>();
		listaNome.add("oswaldo");
		listaNome.add("oswaldo");//nao permite repeticao
		listaNome.add("gisele");
		listaNome.add("giovanna");
		listaNome.add("giulianna");
		
		for(String nome:listaNome) {
			System.out.println(nome);
		}
		
		
		
		
		
		
		
		
		
	}

}
