package exemplos;

import java.lang.reflect.*;

public class TesteR {
	public static void main(String args[]) {
		 
		try {
			Class cls = Class.forName("exemplos.Pessoa");
			Method [] listaDeMetodos = cls.getMethods();
			for (int i = 0; i < listaDeMetodos.length; i++) {
				Method m = listaDeMetodos[i];
				System.out.println("Nome do Metodo = " + m.getName());
				System.out.println("Declaracao da classe = "+ m.getDeclaringClass());
			}
			boolean b2 = cls.isInstance(new Pessoa());
			System.out.println(b2);
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}
