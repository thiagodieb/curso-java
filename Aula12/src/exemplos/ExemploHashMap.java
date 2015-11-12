package exemplos;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
 

public class ExemploHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Number,String> ha = new HashMap<Number,String>();
		ha.put(1,"Dieb");
		ha.put(3,"Lindalva");
		ha.put(5,"Operina");
		ha.put(2,"Itamar");
		ha.put(1,"MA");
		
		System.out.println(ha);
		
		TreeMap a = new TreeMap(ha);
		System.out.println(a.descendingMap());
		 
		
		
	}

}
