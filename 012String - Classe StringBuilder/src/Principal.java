
public class Principal {
/*
	StringBilder 
		faz a mesma coisa q a bilder porem ela 
		nao é tread safe.
*/	
	public static void main(String[] args) {
		String nome = "icaro";
		String sobreNome ="josep";
		
		
	
		System.out.println(nome+" "+sobreNome);
		
		
		String nomeComBufer = new String();
		StringBuilder bufer =new StringBuilder();
		
		bufer.append(nome);
		bufer.append(sobreNome);
		
	
		nomeComBufer = bufer.toString();
		
		
		System.out.println(nomeComBufer);
		
		
	}

}
