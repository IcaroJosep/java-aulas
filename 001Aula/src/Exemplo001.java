
import java.util.Iterator;
import java.util.Scanner;



public class Exemplo001 {

	public static void main(String[] args) {
	
   /*VARIAVEIS*/
		
		/*	short x1 = 999; 		 // -32768 to 32767
			int   x2 = 99999; 		 // -2147483648 to 2147483647
			long  x3 = 99999999999L; // -9223372036854775808 to 9223372036854775807
	    */
			/*float x4 = 1.2;
			 * o java entende por padr�o como double para q ele aceite a declara��o vc 
			tem q informa-lo da ciente da perda de precis�o da 
			seguinte forma :		*/
		/*	float x4=1.2f;                  //float em Java pode armazenar at� 7 d�gitos significativos, incluindo a parte inteira e decimal
			float x4b=(float) 1.2;   //precisao 0.000007
		
			double x5 = 99.99d;  // segue mesmas regras do float so q com 15 casas
	
			byte x6 = 99; // -128 to 127
			char x7 = 'A';
			boolean x8 = true;
			
			String nome = "icaro" ;
		
		*/    
/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * */	
		
	/*OPERADORES
			//MATEMATICOS
				+ = SOMA
				- = SUBTRA�AO
				/ = DIVISAO
			 	* = MUTIPLICA�AO
				% = RESTO DE DIVISAO
			
			//LOGICOS
			 	=  .ATRIBUICAO
			 	!  .NEGACAO
			 	++ .INCREMENTO   EX:(INT I=1;) I++ == I = I+1 (I=2) ////  POSIBILIT: I += 2 (I=3)
			 	-- .DECREMENTO
			 	|| .OU/OR     UM OU OUTRO
			 	&& .E/AND     EM E OUTRO
			 
			//RELACIONAIS
			 	== .COMPARA�AO
			 	!= .DIFERENTE
			 	<  .MENOS
			 	>  .MAIOR
			 	<= .MENOS ou IGUAL
			 	>= .MAIOR ou IGUAL
			 	
			 */
		
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	*/	
				
/* SCANNER:
	 
		  	+ biblioteca deve ser importada :
		  		- import java.util.Scanne             */
		
		/*	System.out.println("-----TESTE DE SCANNER");
			Scanner input = new Scanner(System.in); // cria��o do scanner 
	    	System.out.println("Enter your name: ");
	    	String nome = input.next();   //atribuicao de uma string a variavel nome
	    	int idade = input.nextInt(); //atribuicao de int a variavel idade
	    	input.close();//fechamento do scanner
	    	System.out.println("Hello, " + nome +' '+idade);
	    */
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// STRING 
				
			/*	Scanner in = new Scanner(System.in);
												 						
				// capitura  primeiro nome 
				System.out.print("Digite o primeiro nome: ");/////////////next ele capitura a token "palavraa" 
				String primeiroNome = in.next();						//ete encomtrar um epaxo em branco oubra de linha"\n"
				System.out.println("Primeiro nome: " + primeiroNome);   // porem ele nao comsome o "\n" dexando-o no fluxo de entrada
		 
				// Consume newline character after first name
				in.nextLine(); /////////////////////////////////////////// este nextLine e chamado para comsumir o "\n" 
																		//dexado no fluxo . como o ponteiro do fluxo aponta para \n ele se encera outomaticamente
																		//dexando o ponteiro no inicio de uma linha vasia
				// capitura nome completo	
				System.out.print("Digite o nome completo: ");
				String nomeCompleto = in.nextLine();/////////////////////este inicia em uma linha completamente vazia o
				System.out.println("Nome completo: " + nomeCompleto);  //onde o ponteiro foi deixado pelo nextLine anterior

				in.close();
			*/
		
/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
		/*	//exemplo de uso
		 
		    System.out.println("media de notas");
		    float n1,n2,n3;
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
			
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	    	
	
	//SWITCH-CASE 
			
		/*  int numero = 0;
			System.out.println("escolha uma opcoao de 1 a 2!");
			Scanner opcao = new Scanner(System.in);
			numero = opcao.nextInt() ;
			opcao.close();
			switch (numero) {
				case 1 : {
					System.out.println("o numero �! um");
					break;//apos entrar em um cese ele execurara dodos os cases a baixo :
						  // param isso serve o break , ele encera o switch
				}
				case 2: 
				case 3:{
					System.out.println("o numero �! dois ou tres");
					break;
				}
				default :{
					System.out.println("a opcao nao �! avalida");
				}
					
			}
		*/
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
			
	//WHILE
		
											//testa primeiro executa depois									
		/*	int numero = 1;
			while (numero<=20) {
				System.out.println(numero);
				numero++;
			}
		*/	
			
											//executa primeiro testa depois	
		
		/*	int numero= 6;
			do {
				System.out.println(numero);
				numero++;
			} while (numero<=5);
		*/	
			
		
		
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	//FOR
			
		/*	for (int i=1;i<=5;i++) {
				System.out.println(i);				
			}
		*/
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			
		//for each	
		
				//	O loop for each � mais simples e conciso para 
				//	casos em que voc� apenas precisa imprimir
				//	os elementos da cole��o.
				
			/*	int[] notas= {9,10,8};
				for(int valor:notas) {
					System.out.println("nota :"+valor);
				}
			*/	
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		//BIDIMENCIONAIS
		
			/*	int[][] matriz ={ {1,2},{3,4} };
						
				for (int l = 0; l < matriz.length; l++) {   //length da o tanto da linha neste caso 2
					for (int c = 0; c < matriz[l].length; c++) {//aki length dis quantos linhas tem dentro de cada [l] da mateiz nno caso 2
						System.out.print(matriz[l][c]+" ");
					}
					System.out.println("");
				}		
			*/	
				int[][] matriz ={ {1,2},{3,4} };
				
				for (int[] linha : matriz) {   //length da o tanto da linha neste caso 2
					for (int coluna :linha) {//aki length dis quantos linhas tem dentro de cada [l] da mateiz nno caso 2
						System.out.print(coluna+" ");
					}
					System.out.println("");
				}
						
		
			
/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * */

// STRING 
		 //String � um class embora seja usado como tipo primitivo
		//logica igual ao de votero porem tem funcionalidades intrincicas a oq fos dela uma classe 
		
		/*	String nome = "icaro" ;
			System.out.println("aluno : "+nome);
		*/	
		
																	//FUNCIONAMENTO DA Scanner:
		/*	Scanner in = new Scanner(System.in);
											 						
			// capitura  primeiro nome 
			System.out.print("Digite o primeiro nome: ");/////////////next ele capitura a token "palavraa" 
			String primeiroNome = in.next();						//ete encomtrar um epaxo em branco oubra de linha"\n"
			System.out.println("Primeiro nome: " + primeiroNome);   // porem ele nao comsome o "\n" dexando-o no fluxo de entrada
	 
			// Consome quebra de linha ap�s o primeiro nome
			in.nextLine(); /////////////////////////////////////////// este nextLine e chamado para comsumir o "\n" 
																	//dexado no fluxo . como o ponteiro do fluxo aponta para \n ele se encera outomaticamente
																	//dexando o ponteiro no inicio de uma linha vasia
			// capitura nome completo	
			System.out.print("Digite o nome completo: ");
			String nomeCompleto = in.nextLine();/////////////////////este inicia em uma linha completamente vazia o
			System.out.println("Nome completo: " + nomeCompleto);  //onde o ponteiro foi deixado pelo nextLine anterior
													
			in.close();												//OUTRAS OPCOES PARA LIDAR COM O "\n":
		*/															 	
																    //in.nextLine(): Op��o mais simples e direta para consumir o caractere de quebra de linha (\n).
																    //in.useDelimiter(): Permite capturar o nome completo em uma �nica chamada, mas exige a defini��o do delimitador.
																	//in.hasNextLine(): Oferece verifica��o expl�cita de disponibilidade da linha, mas aumenta a complexidade.
																	//Loop while: �til para construir o nome completo caractere por caractere, mas menos eficiente para nomes longos.
		
/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/	
		
// ARRAY OU VETOR		fomas de declaracao "int[] vetor" ou "int vetor[]" 
						// em um eu declaro q � uma matriz de inteiros chamada vetor
						// no outro q � um vetor chamado vetor de inteiros
					
			
			//por array nao ser um dao primitivo � obrigatoria a inicializao assim como Scanner[
			
		/*	int[] nota=new int[3];	           
			 							
			nota[0]=9;
			nota[1]=10;
			nota[2]=8;
			
			for(int i=0 ; i<3 ;i++) {
				System.out.println("nota :"+nota[i]);
			}
		*/
			
		/*	int[] nota = {9,10,8};	 //inicializacao dinamica          
		
			for(int i =0 ;i<3;i++) {
				System.out.println("nota :"+nota[i]);
			}
		*/
			
		/*	int[] nota = {9,10,8};	 //inicializacao dinamica          
			
			for(int valor:nota) {    // for each
				System.out.println("nota :"+valor);
			}
		*/
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		//BIDIMENCIONAIS
			
		/*	int[][] matriz ={ {1,2},{3,4} };
					
			for (int l = 0; l < matriz.length; l++) {   //length da o tanto da linha neste caso 2
				for (int c = 0; c < matriz[l].length; c++) {//aki length dis quantos linhas tem dentro de cada [l] da mateiz nno caso 2
					System.out.print(matriz[l][c]+" ");
				}
				System.out.println("");
			}
		*/	
			
		
		
		
		
		
		
		
		
	}

}
