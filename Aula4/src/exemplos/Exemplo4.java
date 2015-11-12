package exemplos;

public class Exemplo4 {
 
	public static void main(String[] args) {
		 
		int b = 10;
		int c = 15;
		
		int d = c++;
		
		System.out.println("D="+d);
		System.out.println("C="+c);
		
		System.out.println("******");
		d = ++b;
		
		System.out.println("D="+d);
		System.out.println("B="+b);
		
		d = 10;
		c = 15;
		b = 20;
		
		int j = (++d) - ((c--) + (b++));
		System.out.println(j);

	}

}



