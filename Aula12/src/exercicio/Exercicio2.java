package exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		lista.add("Gilmarion");
		lista.add("Leon");
		lista.add("Arnalberto");
		lista.add("Lenin");
		lista.add("Ledinal"); 
		System.out.println(lista);
		
		TreeSet t = new TreeSet(lista);
		System.out.println(t);
		
		Iterator it = t.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}
	

}
