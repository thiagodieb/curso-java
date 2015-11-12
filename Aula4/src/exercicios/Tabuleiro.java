package exercicios;

public class Tabuleiro {

	public static void main(String[] args) {
		
		
		for (int j = 0; j < 10; j++) {
			
			if(j%2 == 0){
				System.out.print(" ");	
			}
			
			for (int i = 0; i < 10; i++) {
				System.out.print("* "); 
			} 
			
			System.out.println("");
			
		}
		
		
	}
	
}
