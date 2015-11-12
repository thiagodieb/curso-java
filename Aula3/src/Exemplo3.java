
public class Exemplo3 {


	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("Cre");
		StringBuffer b = new StringBuffer("Silva");
		StringBuffer c = new StringBuffer("Jose");
		StringBuffer d = a;
		a = a.append("Rob");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		
		Pessoa var1 = new Pessoa();
		var1.nome = "Cremilda";
		Pessoa var2 = var1;
		
		var2.nome = "Roberval";
		
		Pessoa var3 = var1;
		
		var3.nome = "Juremarival";
		
		
		System.out.println(var1.nome);
		
		
		
		
	}
}

