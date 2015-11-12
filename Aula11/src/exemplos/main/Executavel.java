package exemplos.main;

import exemplos.reflexao.ValidadorAnnotations;
import exemplos.entidades.Pessoa;

public class Executavel {
	public static void main(String[] args) {
		
		Pessoa obj = new Pessoa();
		String objS = new String("teste");
		
		
		ValidadorAnnotations.validar(obj);
		ValidadorAnnotations.validar(objS);
		
		
	}
}
