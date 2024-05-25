
public class Principal {
/*
 	String é um obj portanto tbm tem metodos
 	por exemplo (.lenghth())
 	
	 	obs:
		 **	imutabilidade de string
		 
				String nome = "icaro";
				nome = "pedro";
		
				Explicação:
		
				A primeira linha cria um objeto String "icaro" e armazena sua referência em nome.
				A segunda linha não modifica o objeto String original "icaro".
				Em vez disso, ela cria um novo objeto String "pedro" e atualiza a referência da variável nome para apontar para este novo objeto.
				O objeto String original "icaro" permanece na memória, mas não é mais acessível pela variável nome.
			
*/	
	
		
	public static void main(String[] args) {
		String nome ="icaro";
		String sobrenome=new String("josep");
		
		
		System.out.println(nome);
		System.out.println(sobrenome);
		
		
		//é uma clase  por isso possui metodos
		System.out.println(nome.length());//".lenghth() nos da o tamanho da string"
		System.out.println(sobrenome.length());
	}

}
