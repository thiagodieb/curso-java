package exemplos.reflexao;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import exemplos.annotations.Verificador;
import exemplos.entidades.Pessoa;

public class ValidadorAnnotations {
	public static void validar(Object obj) {
		Class classe = obj.getClass();
		
		System.out.println(classe.getName());
		Method[] metodos = classe.getMethods();
		 
		
		for (int i = 0; i < metodos.length; i++) {
			System.out.println(metodos[i].getName());
			Annotation [] a = metodos[i].getAnnotations();
			
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[j]);
			}
 
		}
		
		System.out.println("---------");
	}
}
