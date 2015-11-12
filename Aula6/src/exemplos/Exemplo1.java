package exemplos;

public class Exemplo1 {

	
	public static void main(String[] args) {
		
		String a = "Teofilo";
		System.out.println(a.hashCode());
		a = " Perolina";
		System.out.println(a.hashCode());
		
		
		System.out.println(a.charAt(2));
		System.out.println(a.concat(" Silva"));
		System.out.println(a.concat(" Silva").length());
		System.out.println(a.concat(" Silva").trim().length());
		System.out.println(a.substring(3, 8));
		System.out.println(a.replaceAll("lina", "landia"));
		char b [] = a.toCharArray();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}

