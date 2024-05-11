
public class Principal {
/*
  			
  	programacao poo clases abistratas e herança:
    animais se locomoevem ,
    eu e meu cao somos animais ele pertencente a classe canina e eu a humana
    assim a aclase animais seria a classe abistrata ;
    
    quanto a herança seria o fato de nos dois nos locomovermos
    atributo herdado da classe animal ,
    o fato de eu ser bipede e meu cao quadrupede sereia uma sobescricao
	do metodo locomocao chamado polimorfismo"
  
  
 * */
	public static void main(String[] args) {
		Aluno aluno =new Aluno();
		
		//aluno.prova=10; nao é posivel acessar por ser privado
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
