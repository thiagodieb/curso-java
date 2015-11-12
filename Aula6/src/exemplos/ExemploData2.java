package exemplos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploData2 {

	public static void main(String[] args) {

		System.out.println(new SimpleDateFormat("HH:mm:ss dd 'de' MM 'de' yy")
				.format(new Date()));

	}

}