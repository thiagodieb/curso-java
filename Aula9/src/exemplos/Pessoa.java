package exemplos;

public class Pessoa extends Thread {
	private Macarrao comida;
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public void colocarNoPrato(Macarrao obj) {
		this.comida = obj;
	}

	public void run() {
		for (int i = 0; i != comida.quantidade;) {
			System.out.println(nome + " está comendo");
			comida.comer();
			System.out.println(comida.quantidade);
		}
	}
}
