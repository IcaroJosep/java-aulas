package teste;

public class pincipal {

	public static void main(String[] args) {
			int[][] matriz ={ {1,2},{3,4} };
		
		for (int l = 0; l < matriz.length; l++) {   //length da o tanto da linha neste caso 2
			for (int c = 0; c < matriz[l].length; c++) {//aki length dis quantos linhas tem dentro de cada [l] da mateiz nno caso 2
				System.out.print(matriz[l][c]+" ");
			}
			System.out.println("");
		}		
		
		int[][] matriz1 ={ {1,2},{3,4} };
		
		for (int[] linha : matriz1) {   //length da o tanto da linha neste caso 2
			for (int coluna :linha) {//aki length dis quantos colunas tem dentro de cada [l] da mateiz no caso 2
				System.out.print(coluna+" ");
			}
			System.out.println("");
		}
			

	}

}
