package exemplos;

public class InvalidArgsException extends Exception {
	private String msg;

	public InvalidArgsException(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return "Exception [" + this.msg+ "]";
	}
}
