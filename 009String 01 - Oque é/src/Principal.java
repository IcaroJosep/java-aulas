
public class Principal {
/*
 	String � um obj portanto tbm tem metodos
 	por exemplo (.lenghth())
 	
	 	obs:
		 **	imutabilidade de string
		 
				String nome = "icaro";
				nome = "pedro";
		
				Explica��o:
		
				A primeira linha cria um objeto String "icaro" e armazena sua refer�ncia em nome.
				A segunda linha n�o modifica o objeto String original "icaro".
				Em vez disso, ela cria um novo objeto String "pedro" e atualiza a refer�ncia da vari�vel nome para apontar para este novo objeto.
				O objeto String original "icaro" permanece na mem�ria, mas n�o � mais acess�vel pela vari�vel nome.
			
*/	
	
		
	public static void main(String[] args) {
		String nome ="icaro";
		String sobrenome=new String("josep");
		
		
		System.out.println(nome);
		System.out.println(sobrenome);
		
		
		//� uma clase  por isso possui metodos
		System.out.println(nome.length());//".lenghth() nos da o tamanho da string"
		System.out.println(sobrenome.length());
	}

}
