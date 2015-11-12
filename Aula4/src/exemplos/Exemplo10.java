package exemplos;

public class Exemplo10 {
 
	public static void main(String[] args) { 

		int num = 1;
		
		switch (num) {
		case 1:
			System.out.println("valor 1"); 
		case 5:
			System.out.println("valor 5");

		case 10:
			System.out.println("valor 10"); 
			break;
		default:
			System.out.println("nao sei qual é o valor....");
			break;
		}
		
		int valor = 11;
		//double d = valor % 2;
		switch (valor) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("Impar");
			break;
		case 2:	
		case 4:	
		case 6:
		case 8:
		case 10:
			System.out.println("Par");
			break;
		}
		
		
		
		
	}

}
