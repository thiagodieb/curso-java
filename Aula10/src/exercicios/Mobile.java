package exercicios;

public class Mobile extends ViewerData{

	private String modelo;
	
	public Mobile(String m){
		this.modelo = m;
	}

	public String toString() {
		 return "Modelo do mobile:"+this.modelo;
	}
	
}
