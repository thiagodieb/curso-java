package exercicios;

public class Triangulo {
	
	private double area;
	private double altura;
	private double base;
	
	public double calculoDeArea(){
		this.area = (this.base * this.altura) / 2;
		return this.area;
	}
	
	public void inserirAltura(double altura){
		this.altura = altura;
	}
	public void inserirBase(double base){
		this.base = base;
	}
	
	public void inserirDado(double altura, double base){
		this.inserirBase(base);
		this.inserirAltura(altura);
		
	}

}
