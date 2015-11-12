package exercicios;

public class GenericsMet {
	public static void main(String[] args) {
		new GenericsMet().executar();
	}

	public void executar() {
		System.out.println(somar(new Integer[] { 10, 4, 5 }));
		System.out.println(somar(new Byte[] { 10, 4, 5 }));
	}

	public double somar(Integer[] soma) {
		double result = 0.0;
		for (int a = 0; a < soma.length; a++) {
			result += soma[a].doubleValue();
		}
		return result;
	}
}
