
public class Operador extends Pessoa{
	
	int promessas;
	int pagas;
	private int meta=100;
	

	boolean MetaAtingida() {
		if(this.pagas<this.meta) {
			return false;
		}else {
			return true;	
		}
		
	}
	
	
}
