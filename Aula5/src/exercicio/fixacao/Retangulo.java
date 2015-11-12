package exercicio.fixacao;

public class Retangulo extends Quadrilatero {
 
	public Retangulo(double base, double altura) {
		super(base, base, altura, altura);
	}

	public double calcularArea() {
 		return this.getLado1()*this.getLado3();
	}

}
