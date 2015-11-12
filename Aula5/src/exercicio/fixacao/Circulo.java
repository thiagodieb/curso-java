package exercicio.fixacao;

public class Circulo implements FormaGeometrica {

	
	private double raio;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Circulo(double raio){
		this.setRaio(raio);
	}
	
	public double calcularPerimetro() {
		return 2 * Math.PI * this.getRaio();
	}

	public double calcularArea() {
		return Math.PI * (this.getRaio()*this.getRaio());
	}

}
