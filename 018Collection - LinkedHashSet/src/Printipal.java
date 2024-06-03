import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Printipal {
/*
linked poderia ter sido usado da mesma forma como os outros
porem foin inplementado a funcionalidade de atrubuicao do array
para demostra (esta funcionalidade poderia ser feita na outras tbm)
 */
	public static void main(String[] args) {
		ArrayList<Integer> numerosArraylist = new ArrayList<>();
		numerosArraylist.add(8);
		numerosArraylist.add(5);
		numerosArraylist.add(8);
		System.out.println("ArrayList : "+numerosArraylist);
		
		LinkedHashSet<Integer> numerosLinkedHashSet = new LinkedHashSet<>(numerosArraylist);
		// numerosLinkedHashSet.addAll(numerosArraylist);               
		
		System.out.println("LinkedHashSet" + numerosLinkedHashSet);
	}

}
