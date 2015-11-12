package exemplos;
import exemplos.*;
public class Exemplo2 {

	 
	public static void main(String[] args) {
		//Tipo primitivo
		int n = 18;
		int b = n;
		b = 10 + b;
		
		System.out.println(n);
		//Tipos -  Wrapper Classe
		
		Integer m = 19;
		float y = m.floatValue();
		String y2 = m.toString();
		
		System.out.println(m.toString());
		System.out.println(m.compareTo(11111));
		Integer p = m;
		p = p +10;
		System.out.println(m);
		
	/*
		
		
		//Tipo de referencia		
		Pessoa c = new Pessoa();
		c.nome = "Robermarival";
		
		Pessoa j = c;
		j.nome = "Sinoval";
		c.nome = "Edicleide";
		
		System.out.println(c.nome);
		System.out.println(j.nome);
		System.out.println(j);
		System.out.println(c);
*/
	}

}




