package exemplos;

public class Exemplo11 {
 
	public static void main(String[] args) {
 
		int valor = 10;
		int valor2 = 50;
		
		while (valor <= 100) {
			
			while (valor2 < 500) {
				System.out.println("  "+valor2);
				if(valor2 == 100){
					//break;
					return;
				}
				valor2 = valor2 * 2;
				
			} 
			
			valor2 = 50;
			
			System.out.println(valor);

			valor++;
		}
		
		
	}

}









