import discentes.AlunoSuperior;

public class Principal {
/*
    	O modificador de acesso PRIVATE:
    é o mais restritivo, limitando a visibilidade de atributos e métodos a dentro da
    própria classe onde são declarados. Isso significa que:
    
    	Elementos marcados como private:
	Não podem ser acessados por nenhuma outra classe, mesmo que estejam no mesmo pacote.
	Não são herdados por subclasses.
	Somente podem ser acessados de dentro da classe onde foram declarados, incluindo métodos da mesma classe.
	
		Quem pode acessar elementos private:
	Métodos da mesma classe:
	Têm acesso total a todos os membros private,
	podendo modificá-los e utilizá-los livremente.
	
	Classes anônimas:
	Declaradas dentro da mesma classe, também possuem acesso total aos membros private.
	
	Reflexão Java:
	Através de técnicas avançadas, a reflexão permite acessar e modificar elementos private,
	mas não é uma prática recomendada, pois viola o encapsulamento e pode gerar instabilidade no código.
	
 * 
neste codigo as variaveis da class aluno forao alteradas para private
oq gerou a nesesidade de altera o codigo das outras para faze o acesso.
 
 */
	public static void main(String[] args) {
		AlunoSuperior aluno = new AlunoSuperior();
		
		//aluno.nome="icaro";
		aluno.setNome("icaro");
		//aluno.teste=9;
		aluno.setTeste(9);
		//aluno.prova=10;
		aluno.setProva(10);
		
		System.out.println(aluno.getMedia());
	
		
	}

}
/*
	public:
	 O membro da classe pode ser acessado de qualquer lugar,
	 independentemente do pacote ou da herança.
	private: 
 	 O membro da classe só pode ser acessado pela própria classe onde foi declarado.
	protected:
 	 O membro da classe pode ser acessado por classes no mesmo pacote,
 	 subclasses (inclusive em outros pacotes) e pela própria classe onde foi declarado.
	default (padrão):
 	 O membro da classe pode ser acessado por classes no mesmo pacote e subclasses 
 	 (inclusive em outros pacotes), mas não por classes em outros pacotes.
 
*/
