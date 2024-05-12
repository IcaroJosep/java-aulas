
import discentes.AlunoSuperior;

public class Principal {

	public static void main(String[] args) {
    
		AlunoSuperior aluno = new AlunoSuperior();
		
		aluno.nome="icaro";
		aluno.teste=9;
		aluno.prova=10;
		
		System.out.println(aluno.getMedia());
	}

}
