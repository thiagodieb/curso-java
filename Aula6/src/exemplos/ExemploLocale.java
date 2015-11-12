package exemplos;

import java.text.*;
import java.util.Date;
import java.util.Locale;

public class ExemploLocale {

	public static void main(String[] args) {
		double valor = 10.02;
		Locale locale = Locale.getDefault();
		NumberFormat formatter = DecimalFormat.getCurrencyInstance(locale);
		System.out.println(formatter.format(valor));

		locale = Locale.CANADA_FRENCH;
		formatter = DecimalFormat.getCurrencyInstance(locale);
		System.out.println(formatter.format(valor));

		Date d = new Date();
		String dataFormatada = DateFormat.getDateInstance(DateFormat.FULL, locale).format(d);
		System.out.println(dataFormatada);
	}

}