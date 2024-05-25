/*
	a comparacao de strings compara o endereço da memoria
	
		obs: 
		
		quando nos atribuimos o mesmo valor a duas variaveis
			String nome = "icaro";
			String nomeDeGerra="icaro";
		Estas duas variaves apontao o mesmo valor armazenado na memoria	
		
		mais quando atribuimos espicitamente um novo endereço
			String nomeDeGerra2= new String("icaro");
		o valor esta armazenado em um endereço diferente das outras

		por isso acomtece o oq esta acomtecendo abaixo
		
 */
public class Principal {

	public static void main(String[] args) {
		
		String nome = "icaro";
		String nomeDeGerra="icaro";
		String nomeDeGerra2= new String("icaro");
		
		
		if(nome==nomeDeGerra) {
			System.out.println("nomes iguais");
		}else {
			System.out.println("nomes diferentes");	
		}
		
		if(nome==nomeDeGerra2) {
			System.out.println("nomes iguais");
		}else {
			System.out.println("nomes diferentes");	
		}
		
		

	}

}
