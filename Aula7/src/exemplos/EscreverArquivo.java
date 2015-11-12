package exemplos;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscreverArquivo {
	public static void main(String[] args) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("arquivo.txt");
			String texto = "Crie um aplicativo chamando Datas, que capture do usuário 5 datas e que indique qual \n é a menor e qual é a maior data. \n Se uma data informada pelo usuário não for válida, exiba uma me";
			char b[] = texto.toCharArray();
			for (int i = 0; i < b.length; i++) {
				out.write(b[i]);
			}
			System.out.println("OK");
			out.close();
		} catch (IOException e) {
			System.out.println("Error ao salvar o arquivo");
		}
	}
}