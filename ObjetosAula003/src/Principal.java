
public class Principal {
	/*
	 * 		ENCAPSULAMENTO
	 * 
	 * 
	 * */
	public static void main(String[] args) {
	
		Aluno aluno =new Aluno();
				
		//aluno.prova=10; nao é posivel acessar por ser privado
		aluno.setNome("icaro");
		aluno.setProva(10);
		
		System.out.println(aluno.getNome());
		System.out.print(aluno.getProva());
	}

}
