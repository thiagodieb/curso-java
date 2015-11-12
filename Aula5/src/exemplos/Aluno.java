package exemplos;

public class Aluno extends Pessoa{
	
	
	public Aluno(){
		System.out.println("Criando Objeto Aluno...");
		
	}
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	

}
