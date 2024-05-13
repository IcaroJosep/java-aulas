
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
/*	public: 
O membro da classe pode ser acessado de qualquer lugar, independentemente do pacote ou da herança.
	private: 
O membro da classe só pode ser acessado pela própria classe onde foi declarado.
	protected: 
O membro da classe pode ser acessado por classes no mesmo pacote, subclasses (inclusive em outros pacotes) e pela própria classe onde foi declarado.
	default (padrão): 
O membro da classe pode ser acessado por classes no mesmo pacote e subclasses (inclusive em outros pacotes), mas não por classes em outros pacotes.
*/


