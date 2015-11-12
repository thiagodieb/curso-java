package exemplos;

public class Intervalo extends Thread {
	private int tempo;

	public Intervalo(String nome, int valor) {
		super(nome);
		tempo = valor;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print(getName());
			System.out.println(" na etapa:" + i);
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
			}
		}
		System.out.print("Threads terminada:");
		System.out.println(getName());
	}
}
