package exercicios;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method; 

public class Exercicio1 {
	
	public static void main(String args[]) {
		String nomeDaClasse = "java.lang.String";
		try {
			Class cls = Class.forName(nomeDaClasse);
			
			Method [] listaDeMetodos = cls.getDeclaredMethods();
			for (int i = 0; i < listaDeMetodos.length; i++) {
				Method m = listaDeMetodos[i];
				System.out.println("Nome do Método = " + m.getName());
			}
			System.out.println("Quantidade de Métodos: "+listaDeMetodos.length);
			
			Constructor [] listaDeConstrutores = cls.getDeclaredConstructors();
			System.out.println("Quantidade de Construtores: "+listaDeConstrutores.length);
		
			
			Field [] listaDeAtriutos = cls.getDeclaredFields();
			for (int i = 0; i < listaDeAtriutos.length; i++) {
				Field f = listaDeAtriutos[i];
				System.out.println("Nome do Atributo = " + f.getName());
			}
			System.out.println("Quantidade de Atributos: "+listaDeAtriutos.length);
			
		} catch (Throwable e) {
			System.err.println(e);
		}
	}

}
