package exemplos;

public class Th extends Thread {
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			System.out.println("segundo plano da thread");
		}
		
	}
}
