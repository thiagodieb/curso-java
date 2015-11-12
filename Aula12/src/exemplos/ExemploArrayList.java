package exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ExemploArrayList {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("Cremilda");
		a.add(10.3);
		a.add("Alvaro");
		a.add(0,"Zibenlandia");
		
		
		System.out.println(a);
		
		Iterator it =  a.iterator();
		while (it.hasNext()) {
			
			System.out.println(a.get(1).equals(it.next()));
			
		}
		
		a.remove(3);
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
		
		
		LinkedList l = new LinkedList();
		
		l.add("Perolina");
		l.addLast("Helieuda");
		l.add("Acre");
		l.addFirst("Edicleide");
		l.add(1, "Sinoval");
		l.add("Abobora");
		l.add("Alface");
		l.add("Riveraldo");
		l.add("alberto");
		System.out.println(l);
		Iterator itl = l.iterator();
		
		LinkedList letraa = new LinkedList();
		
		while (itl.hasNext()) {
			String temp = (String) itl.next();
			if(temp.indexOf('A') == 0 || temp.indexOf('a') == 0){
				System.out.println(temp);
				letraa.add(temp);
			}else{
				itl.remove();
			}
			
		}
		System.out.println(l);
		System.out.println(letraa);
		
		
	}

}

