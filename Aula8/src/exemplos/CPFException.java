package exemplos;

public class CPFException extends Exception {
	private int dados;

	public CPFException(int a) {
		this.dados = a;
	}

	public String toString() {
		return "CPF Exception [" + dados + "]";
	}
}
