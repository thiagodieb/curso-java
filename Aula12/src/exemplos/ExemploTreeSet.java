package exemplos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
	
	
	public static void main(String[] args) {
		
		HashSet s = new HashSet();
		
		String t = "Thiago";
		s.add("dieb");
		s.add("Thiago ");
		s.add("T");
		s.add("a");
		s.add("1.0");
		s.add("02.1");
		s.add("A");
		s.add("Dieb");
		System.out.println(s);
		
		Set setOrdenado = new TreeSet(s);
		System.out.println(setOrdenado);
		
		
	}

}


