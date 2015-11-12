package exercicios;

public class ThreadExercicio extends Thread{

	public int inicio;
	public int fim;
	
	public ThreadExercicio(String nome, int i, int f){
		super(nome);
		this.inicio = i;
		this.fim = f;
		
	}
	
	public void run() {
		for (int i = this.inicio; i < this.fim; i++) {
			System.out.println(this.getName()+": "+i );
		}
		
	}
}
