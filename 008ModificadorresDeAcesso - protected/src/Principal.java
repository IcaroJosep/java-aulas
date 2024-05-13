import discentes.AlunoSuperior;

public class Principal {
/*		o modificador protected
 * permite o acesso por classes filhas ,
 * mas nega de qualquer outra clase
 * 
 * a alteracao neste codigo esta nas variaves de aluno 
 * e o usso desta alteracao pode ser visto
 * na classe alunoSuperior na inplementacao de getMedia  
 * 
 * os metodos gats e sets de aluno comtinuao 
 * funcionando direto na clase principal pois sao publicos
 * entao o metodo esta acesando a variavel a partir da protria clase	
 * 
 */
	public static void main(String[] args) {
		AlunoSuperior aluno = new AlunoSuperior();
			
		aluno.setNome("icaro");
		
		aluno.setTeste(9);

		aluno.setProva(10);
		
		System.out.println("aluno :"+ aluno.getNome() + "\nmedia :" + aluno.getMedia()); 
	}
}
/*	public: 
O membro da classe pode ser acessado de qualquer lugar, independentemente do pacote ou da heran�a.
	private: 
O membro da classe s� pode ser acessado pela pr�pria classe onde foi declarado.
	protected: 
O membro da classe pode ser acessado por classes no mesmo pacote, subclasses (inclusive em outros pacotes) e pela pr�pria classe onde foi declarado.
	default (padr�o): 
O membro da classe pode ser acessado por classes no mesmo pacote e subclasses (inclusive em outros pacotes), mas n�o por classes em outros pacotes.
*/
