
public class Principal {

	public static void main(String[] args) {
		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		AlunoEnsinosuperior alunoEnsinosuperior = new AlunoEnsinosuperior();
		
		alunoEnsinoMedio.setName("icaro");
		alunoEnsinoMedio.setTeste(8);
		alunoEnsinoMedio.setProva(9);
		
		System.out.println("Aluno do Ensino medio :");
		System.out.println("nome :"+alunoEnsinoMedio.getName());
		System.out.println("media:"+alunoEnsinoMedio.getMedia());
		
		alunoEnsinosuperior.setName("josep");
		alunoEnsinosuperior.setTeste(8);
		alunoEnsinosuperior.setProva(9);
		
		System.out.println("Aluno do Ensino superior :");
		System.out.println("nome :"+alunoEnsinosuperior.getName());
		System.out.println("media:"+alunoEnsinosuperior.getMedia());
			
		
	}
}
