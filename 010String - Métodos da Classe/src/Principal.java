
public class Principal {
/*
	mestodo .iquals()
	 	compara o comteudo
	 	é capas de comparar o comteudo de uma strinq em ves de seu endereço	

 */	
	public static void main(String[] args) {
	
		String nome = "icaro";	
		String nomeGuerra = "icaro";
		String nomeOutoEndereçoDeMemoria=new String("icaro");
		
		if(nome.equals(nomeGuerra)) {
			System.out.println("nomes iguais");
		}else {
			System.out.println("nomes diferentes");	
		}
		
		if(nome.equals(nomeOutoEndereçoDeMemoria)) {
			System.out.println("nomes iguais");
		}else {
			System.out.println("nomes diferentes");	
		}
	
		System.out.println();
		//demais metodos
		nome = "Icaro Josep";
		System.out.println("demais metodos :");
		System.out.print("numero de caracteres :");
		System.out.println(nome.length());
		System.out.print("inprime em letra minuscula: ");
		System.out.println(nome.toLowerCase());
		System.out.print("imprime em letra maiuscula: ");
		System.out.println(nome.toUpperCase());
		System.out.print("inprime a o caractere da posicao 2 arra[3]: " );
		System.out.println(nome.charAt(2));
		System.out.print("ve se esta vazio: ");
		System.out.println(nome.isEmpty());
		System.out.print("indice do ar : ");
		System.out.println(nome.indexOf(" J"));
		System.out.print("comtem ar : ");
		System.out.println(nome.contains("ar"));
		System.out.print("comcatena josep : ");
		System.out.println(nome.concat("josep"));
		System.out.print("igual a Icaro Josep :");
		System.out.println(nome.equals("icaro josep"));
		System.out.print("igual a Icaro Josep ignorando maiusculo e minusculo : ");
		System.out.println(nome.equalsIgnoreCase("icaro josep"));
		
	}

}
