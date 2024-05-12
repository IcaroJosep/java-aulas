
import discentes.AlunoSuperior;

/*		public:
 * 	
 * 	permite q possao ser acessadas de qualquer lugar
 *  clase metodos ou pacotes diferentes
 * 
 *	 aqui neste codigo ha a demostracao de como mesmo em pacotes e clases diferentes 
 *   ha o acesso publico das variaveis
 * 
 * */



public class Principal {

	public static void main(String[] args) {
    
		AlunoSuperior aluno = new AlunoSuperior();
		
		aluno.nome="icaro";
		aluno.teste=9;
		aluno.prova=10;
		
		System.out.println(aluno.getMedia());
	}

}
