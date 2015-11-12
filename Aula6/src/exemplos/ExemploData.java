package exemplos;

import java.util.Date;

public class ExemploData {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDay());
		System.out.println(d.getDate());
		System.out.println(d.getMonth());
		System.out.println(d.getTime());
		d.setTime(1495177023493L);
		System.out.println(d);
		d.setYear(2012);
		System.out.println(d);
		
		
	}

}

