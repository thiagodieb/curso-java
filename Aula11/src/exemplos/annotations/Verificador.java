package exemplos.annotations;

import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
// define em qual momento vai ser executada
@Target(ElementType.METHOD)
// onde pode ser colocada a Anotação


public @interface Verificador {
	String Type();
}
