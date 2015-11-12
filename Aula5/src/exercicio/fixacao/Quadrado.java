package exercicio.fixacao;

public class Quadrado extends Quadrilatero {

	 
	public Quadrado(double l1) {
		super(l1, l1, l1, l1);
	}

	public double calcularArea() {
 		return this.getLado1()*this.getLado2();
	}

}
