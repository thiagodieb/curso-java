package exemplos;

import pacote3.Calculadora;

public class Exemplo8 { 
	
	
	public static void main(String[] args) { 

		int x = Integer.parseInt(args[0]);
		
		Calculadora c = new Calculadora();
		
		c.parOuImpar(x);
		
	}

}
