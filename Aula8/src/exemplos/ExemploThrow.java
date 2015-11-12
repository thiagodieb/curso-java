package exemplos;

public class ExemploThrow {
	public static void main(String args[]) {
		try {
			int length = 12;
			if (length <= 11) {
				
				throw new CPFException(length);
				//
			}else{
				throw new NumberFormatException("cpf errado");
			}
			
			//System.out.println(length);

		} catch (NumberFormatException e) {
			System.out.println("Excecao capturada: " + e);
		} catch (CPFException e) {
			System.out.println("Excecao capturada: " + e);
		}
		System.out.println("OK");
		
	}
}
