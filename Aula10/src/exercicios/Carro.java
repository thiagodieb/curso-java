package exercicios;

public class Carro extends ViewerData{
	
	private int ano;
	private String modelo;
	
	public Carro(int a, String m){
		this.ano = a;
		this.modelo = m;
	}

	public String toString() {
		 return "Modelo do carro:"+this.modelo+" ano do carro: "+this.ano;
	}

}
