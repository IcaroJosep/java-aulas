
public class Principal {
/*
 * 			HERAN�A
 * 	todos os GATs e SATs de nome e inclusive nome vem da clase pessoa
 * 
 * 
 * */
	public static void main(String[] args) {
		Aluno aluno =new Aluno();
		
		//aluno.prova=10; nao � posivel acessar por ser privado
		aluno.setName("icaro");
		aluno.setProva(5.5);
		aluno.setTeste(7.1);
		
		System.out.println("nome  :"+aluno.getName());
		System.out.println("prova :"+aluno.getProva());
		System.out.println("teste :"+aluno.getTeste());
		System.out.println("media :"+aluno.getMedia());
		System.out.println();
		
		Professor professor = new Professor();
		professor.setSalario(1000);
		professor.setName("algusto");
		
		System.out.println("profesor   :"+professor.getName());
		System.out.println("salario    :"+professor.getSalario());	 
		System.out.println("inss       :"+professor.getInss());
		System.out.println("salario lqd:"+professor.getSalarioLiquido());
	}
}
