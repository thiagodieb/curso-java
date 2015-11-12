package pacote3;

public class ExemploCalculadora {

	 
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		c.var1 = 10;
		c.var2 = 4566;
		
		c.soma();
		c.multiplicacao();
		
		c.divisao(10, 4566);
		c.subtracao(10, 4566);
		

	}

}

