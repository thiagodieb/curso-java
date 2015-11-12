package exemplos;

public class Tr implements Runnable {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("runnable");
		}
	}
}
