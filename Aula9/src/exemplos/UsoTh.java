package exemplos;

public class UsoTh {
	public static void main(String[] args) {
		Th t = new Th();
		t.start();
		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
			if(i == 500000){
				t.stop();	
			}
		}
	}
}
