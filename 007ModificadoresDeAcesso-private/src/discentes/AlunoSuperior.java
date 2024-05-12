package discentes;

public class AlunoSuperior extends Aluno {

	public double getMedia() {
		//return (teste+prova)/2;
		return (getTeste()+getProva())/2;
	}
	
}
 