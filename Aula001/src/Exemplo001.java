import java.util.Scanner;

public class Exemplo001 {

	public static void main(String[] args) {
	
	/*VARIAVEIS*/
		
		/*	short x1 = 999; 		 // -32768 to 32767
			int   x2 = 99999; 		 // -2147483648 to 2147483647
			long  x3 = 99999999999L; // -9223372036854775808 to 9223372036854775807
	    */
			/*float x4 = 1.2;
			 * o java entende por padrão como double para q ele aceite a declaração vc 
			tem q informa-lo da ciente da perda de precisão da 
			seguinte forma :		*/
		/*	float x4=1.2f;                  //float em Java pode armazenar até 7 dígitos significativos, incluindo a parte inteira e decimal
			float x4b=(float) 1.2;   //precisao 0.000007
		
			double x5 = 99.99d;  // segue mesmas regras do float so q com 15 casas
	
			byte x6 = 99; // -128 to 127
			char x7 = 'A';
			boolean x8 = true;
		*/    
	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * */	
		
	/*OPERADORES
			//MATEMATICOS
				+ = SOMA
				- = SUBTRAÇAO
				/ = DIVISAO
			 	* = MUTIPLICAÇAO
				% = RESTO DE DIVISAO
			
			//LOGICOS
			 	=  .ATRIBUICAO
			 	!  .NEGACAO
			 	++ .INCREMENTO   EX:(INT I=1;) I++ == I = I+1 (I=2) ////  POSIBILIT: I += 2 (I=3)
			 	-- .DECREMENTO
			 	|| .OU/OR     UM OU OUTRO
			 	&& .E/AND     EM E OUTRO
			 
			//RELACIONAIS
			 	== .COMPARAÇAO
			 	!= .DIFERENTE
			 	<  .MENOS
			 	>  .MAIOR
			 	<= .MENOS ou IGUAL
			 	>= .MAIOR ou IGUAL
			 	
			 */
		
	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	*/	
				
	/* SCANNER:
	 
		  	+ biblioteca deve ser importada :
		  		- import java.util.Scanne             */
		/*	System.out.println("-----TESTE DE SCANNER");
			Scanner input = new Scanner(System.in); // criação do scanner 
	    	System.out.println("Enter your name: ");
	    	String nome = input.next();   //atribuicao de uma string a variavel nome
	    	int idade = input.nextInt(); //atribuicao de int a variavel idade
	    	input.close();//fechamento do scanner
	    	System.out.println("Hello, " + nome +' '+idade);
	    */
    /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    	
// LOOPs
	//IF-ELSE e else if
	    	
	   /* 	int valor=7;
	    	
	    	if(valor==8) {
	    			System.out.println("valor igual a 8");
	    	}else if(valor>8) {
	    			System.out.println("valor maior a 8");	
	    	}else {
	    			System.out.println("valor menor a 8");
	    	}
	    */	
		/*	float n1,n2,n3;
			System.out.println("-------teste if-else");
			Scanner in = new Scanner(System.in);
			System.out.println("DIGITE A PRIMEIRA NOTA; ");
			n1=in.nextFloat();
			System.out.println("DIGITE A SEGUNDA NOTA;");
			n2=in.nextFloat();
			System.out.println("DIGITE A TERCEIRA NOTA;");
			n3=in.nextFloat();
			in.close();
			float media =(n1+n2+n3)/3;
			System.out.println("media :"+ media);
			if(media<4) {
				System.out.println("reprovado");
			}else if(media>=6) {
				System.out.println("aprovado");
			}else {
				System.out.println("Recuperacao");
			}	
		*/	
			
	    	  	
	    	
	}

}
