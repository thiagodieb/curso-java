package exercicios;

public class Triangulo2 {
	
	public static void main(String[] args) {
		int linhas = 10;
		
		for (; linhas > 0; linhas--) {

			for (int i = 0; i < linhas; i++) {
				System.out.print(" ");
				
			}
			
			for (int j = 11; j > linhas; j--) {
				System.out.print("*");
			}
			
			for (int j = 10; j > linhas; j--) {
				System.out.print("*");
			}
			
			
			System.out.println("");
			
		}
	}

}
