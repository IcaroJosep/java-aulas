import discentes.AlunoSuperior;

public class Principal {
/*
    	O modificador de acesso PRIVATE:
    � o mais restritivo, limitando a visibilidade de atributos e m�todos a dentro da
    pr�pria classe onde s�o declarados. Isso significa que:
    
    	Elementos marcados como private:
	N�o podem ser acessados por nenhuma outra classe, mesmo que estejam no mesmo pacote.
	N�o s�o herdados por subclasses.
	Somente podem ser acessados de dentro da classe onde foram declarados, incluindo m�todos da mesma classe.
	
		Quem pode acessar elementos private:
	M�todos da mesma classe:
	T�m acesso total a todos os membros private,
	podendo modific�-los e utiliz�-los livremente.
	
	Classes an�nimas:
	Declaradas dentro da mesma classe, tamb�m possuem acesso total aos membros private.
	
	Reflex�o Java:
	Atrav�s de t�cnicas avan�adas, a reflex�o permite acessar e modificar elementos private,
	mas n�o � uma pr�tica recomendada, pois viola o encapsulamento e pode gerar instabilidade no c�digo.
	
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
	 independentemente do pacote ou da heran�a.
	private: 
 	 O membro da classe s� pode ser acessado pela pr�pria classe onde foi declarado.
	protected:
 	 O membro da classe pode ser acessado por classes no mesmo pacote,
 	 subclasses (inclusive em outros pacotes) e pela pr�pria classe onde foi declarado.
	default (padr�o):
 	 O membro da classe pode ser acessado por classes no mesmo pacote e subclasses 
 	 (inclusive em outros pacotes), mas n�o por classes em outros pacotes.
 
*/
