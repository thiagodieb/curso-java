package exemplos;

public class Macarrao {
	public int quantidade;

	public Macarrao(int quantidade) {
		this.quantidade = quantidade;
		System.out.println("Obj macarrao");
	}

	public synchronized void comer() {
		if (this.quantidade > 0) {

			this.quantidade--;
			System.out.println("comi");
			
			if (this.quantidade == 500 || this.quantidade == 480 || this.quantidade == 470) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (this.quantidade == 200) {
				this.notifyAll();
			}


		} else {
			System.out.println("prato vazio");
		}
	}
}
