package discentes;

public class Aluno {
//  private
	protected String nome;
	protected double teste,prova;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

/*	public double getTeste() {   // nao estao sendo usados
		return teste;
	}
*/
	public void setTeste(double teste) {
		this.teste = teste;
	}

/*	public double getProva() {   // nao estao sendo usados
		return prova;
	}
*/
	public void setProva(double prova) {
		this.prova = prova;
	}
	
	
}
