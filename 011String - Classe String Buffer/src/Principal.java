
public class Principal {
/*
 StringBuffer 
 	� uma alternativa a comcatenacao:
 		
 		O buffer oferece uma alternativa mutavel 
 		as strings , assim melhorando a performace
 		
 		
 		PROBLEMA da comcatenacao � q as strings
 		sao imutaves entao cada ves q uma string 
 		� comcatenada ela cria uma nova string na memoria
		

 */

	public static void main(String[] args) {
		String nome = "icaro";
		String sobreNome ="josep";
		
		
		//comcatenacao
		System.out.println(nome+" "+sobreNome);
		
		//buferiza�ao
		String nomeComBufer = new String();
		StringBuffer bufer = new StringBuffer();
		
		bufer.append(nome);
		bufer.append(sobreNome);
		
		/*Converte o conte�do do StringBuffer (bufer)
		em um objeto String regular e o atribui 
		� vari�vel nomeComBufer. 
		Isso cria um novo objeto String imut�vel
		contendo a string combinada*/
		nomeComBufer = bufer.toString();
		
		
		System.out.println(nomeComBufer);
		
	}

}
