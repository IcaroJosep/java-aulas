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
