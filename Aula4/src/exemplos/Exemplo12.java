package exemplos;

public class Exemplo12 {
 
	public static void main(String[] args) {
		 
		int valor = 0 ;
		while (valor < 100) {
			valor++;
			if(valor % 2 != 0){
				continue;
			}
			
			System.out.println(valor);
			System.out.println("***");

		}
	}

}
