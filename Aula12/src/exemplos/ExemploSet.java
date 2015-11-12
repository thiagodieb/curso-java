package exemplos;

import java.util.HashSet;

public class ExemploSet {
	
	
	public static void main(String[] args) {
		
		HashSet s = new HashSet();
		
		String t = "Thiago";
		s.add("Thiago ");
		s.add(12);
		s.add(20.0);
		s.add(new StringBuffer("Dieb"));
		System.out.println(s);
		
		s.remove("Dieb");
		s.clear();
		System.out.println(s);
		
		
		
		
	}

}


