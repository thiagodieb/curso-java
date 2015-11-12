package exemplos;

public class Exemplo9 {
 
	public static void main(String[] args) {
 
		int valorInicial = 0;
		int valorFinal = 10;
		
		while(valorInicial < valorFinal){
			System.out.println("While - "+ valorInicial);
			valorInicial++;
		}
		
		
		valorInicial = 0;
		
		do {
			System.out.println("Do While - "+ valorInicial);
			valorInicial++;
		} while (valorInicial < valorFinal);
		
		
		for (valorInicial = 0; valorInicial < valorFinal; valorInicial++) {
			System.out.println("For - "+ valorInicial);
		}
		
		valorInicial = 0;
		
		for(;valorInicial < 100;){
			System.out.println("For2 - "+ valorInicial);
			valorInicial++;

		}
		 
		
		
	}

}
