package exercicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> selecao = new HashMap<Integer, String>();
		selecao.put(1, "Julio");
		selecao.put(2, "Tiago");
		selecao.put(89, "Andre");
		selecao.put(4, "Huck");
		selecao.put(5, "Roberto");
		selecao.put(18, "Ronaldo");
		selecao.put(7, "Romario");
		selecao.put(8, "Paulinho");
		selecao.put(9, "Neymar");
		selecao.put(10, "Fred");
		selecao.put(11, "Jo");
		
		/*for (int i = 1; i < 12; i++) {
			System.out.println(selecao.get(i));
		}*/
		
		TreeMap t = new TreeMap(selecao);
		Iterator it = t.navigableKeySet().iterator();
		
		while (it.hasNext()) {
			int numero = (Integer) it.next();
			System.out.println(numero+" : "+selecao.get(numero));
			
		}
	}

}

