import java.util.Comparator;

/*
 criacao de metodo de comparacao
*/
public class EstoqueComprador implements Comparator<Produto> {

	
	@Override //sopreescrita do metodo compare de "Comparator"
	public int compare(Produto produto1, Produto produto2) {
			if(produto1.quantidadeEstoque==produto2.quantidadeEstoque) {
				return 0;
			}else if(produto1.quantidadeEstoque > produto2.quantidadeEstoque){
				return 1;
			}else {
				return -1;
			}
	}

}
