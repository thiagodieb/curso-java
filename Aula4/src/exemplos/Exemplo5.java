package exemplos;


public class Exemplo5 {

	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		
		int j = a + b + 1;
		boolean valor = j == (a+b);
		
		boolean valor2 = !valor && (j != a);
		
		
		System.out.println(valor);
		
		System.out.println(valor2);
	}

}

