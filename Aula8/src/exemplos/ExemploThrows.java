package exemplos;

public class ExemploThrows {
	
	public static void metodo() throws CPFException {
		System.out.println("rodando metodo.");
		throw new CPFException(1);
	}
	
	
	public static void main(String args[]) {
		try {
			metodo();
		} catch (CPFException e) {
			System.out.println("Aconteceu exceçãodo tipo CPF.....");
		}
	}
	
	
	
}
