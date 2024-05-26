
public class Principal {
/*
 StringBuffer 
 	É uma alternativa a comcatenacao:
 		
 		O buffer oferece uma alternativa mutavel 
 		as strings , assim melhorando a performace
 		
 		
 		PROBLEMA da comcatenacao é q as strings
 		sao imutaves entao cada ves q uma string 
 		é comcatenada ela cria uma nova string na memoria
		

 */

	public static void main(String[] args) {
		String nome = "icaro";
		String sobreNome ="josep";
		
		
		//comcatenacao
		System.out.println(nome+" "+sobreNome);
		
		//buferizaçao
		String nomeComBufer = new String();
		StringBuffer bufer = new StringBuffer();
		
		bufer.append(nome);
		bufer.append(sobreNome);
		
		/*Converte o conteúdo do StringBuffer (bufer)
		em um objeto String regular e o atribui 
		à variável nomeComBufer. 
		Isso cria um novo objeto String imutável
		contendo a string combinada*/
		nomeComBufer = bufer.toString();
		
		
		System.out.println(nomeComBufer);
		
	}

}
