package exercicio;

public class FabricaDeLampada {

	class Incandescente implements Lampada {

		public void ligar() {
			System.out.println("Ligando uma incandescente");
		}

		public void desligar() {
			System.out.println("Desligando uma incandescente");

		}
	}

	class Fluorescente implements Lampada {
		public void ligar() {
			System.out.println("Ligando uma Fluorescente");
		}

		public void desligar() {
			System.out.println("Desligando uma Fluorescente");

		}
	}

	public Lampada construir(String tipo) {
		Lampada retorno;
		if (tipo.equals("Fluorescente")) {
			retorno = new Fluorescente();
		} else {
			retorno = new Incandescente();
		}

		return retorno;

	}
}
