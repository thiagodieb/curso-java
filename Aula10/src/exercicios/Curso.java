package exercicios;

public class Curso extends ViewerData{
	
	private String turma;
	private String perido;
	
	public Curso(String t, String p){
		this.turma = t;
		this.perido = p;
	}

	public String toString() {
		 return "Turma :"+this.turma+" no perido: "+this.perido;
	}

}
