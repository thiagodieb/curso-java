package exemplos;

public class UsoTr {
	public static void main(String[] args) {
		Tr r = new Tr();
		Thread novaThread = new Thread(r);
		novaThread.start();
	}
}
