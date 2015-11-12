package pacote3;

public class Calculadora {

	public double var1;
	public double var2;

	private void msg(String metodo, double valor) {
		System.out.println(metodo + ": " + valor);
	}

	public void soma() {
		double r = this.var1 + this.var2;
		msg("SOMAR", r);

	}

	public void multiplicacao() {
		double r = this.var1 * this.var2;
		msg("MULTIPLICAR", r);
	}

	public void divisao(double var, double var2) {
		double r = var / var2;
		msg("DIVIDIR", r);
	}

	public void subtracao(double var, double var2) {
		double r = var - var2;
		msg("SUBTRAIR", r);
	}

	public void parOuImpar(double var) {
		if (var % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	}

}
