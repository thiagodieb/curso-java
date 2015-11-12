package exemplos;

public class TesteStringBuffer {
	public static 	void main(String[] args) {

		StringBuffer sb = new StringBuffer("Thiago ");
		System.out.println("HashCode de sb antes: " + sb.hashCode());
		sb.append("Dieb");
		System.out.println("HashCode de sb depois: " + sb.hashCode());
		System.out.println(sb);
		
		
	}
}
