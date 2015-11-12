package exemplos;

public class ExemploExcecao2 {
	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int j = Integer.parseInt(args[0]);
			System.out.println("j = " + j);
			int c[] = { 1 };
			c[j] = 99;
			System.out.println("sucesso...");
		} catch (ArithmeticException e) {
			System.out.println("Div por 0: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Estouro indice array: " + e);
			
		}
		
		System.out.println("codigo executado..");
	}
}

