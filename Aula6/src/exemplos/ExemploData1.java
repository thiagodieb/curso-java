package exemplos;

import java.text.DateFormat;
import java.util.Date;

public class ExemploData1 {

	public static void main(String[] args) {
		
		Date d = new Date();
		String dataFormatada = DateFormat.getDateInstance().format(d);
		System.out.println(dataFormatada);

		String dataFormatadaShort = DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
		System.out.println(dataFormatadaShort);
		String dataFormatadaShort2 = DateFormat.getDateInstance(DateFormat.SHORT).format(d);
		System.out.println(dataFormatadaShort2);
		String dataFormatadaShort3 = DateFormat.getDateInstance(DateFormat.FULL).format(d);
		System.out.println(dataFormatadaShort3);

	}

}