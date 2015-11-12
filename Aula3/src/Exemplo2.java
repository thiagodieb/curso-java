
public class Exemplo2 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 12;
		int c = b;
		int d = 1;
		
		b = 10;
		a = c;
		d = a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
