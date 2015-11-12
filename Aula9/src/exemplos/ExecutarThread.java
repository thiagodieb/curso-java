package exemplos;

public class ExecutarThread {
	public static void main(String args[]) {
		Intervalo a, b;
		a = new Intervalo("Cavalinho 2", 10000);
		a.start();
		b = new Intervalo("Cavalinho 1", 5000);
		b.start();
	}
}
