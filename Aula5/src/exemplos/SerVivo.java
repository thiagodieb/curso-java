package exemplos;

public abstract class SerVivo {

	
	private String especie;
	private String genero;
	
	public abstract String modoDeLocomocao();
	
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}
