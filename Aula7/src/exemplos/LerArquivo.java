package exemplos;

import java.io.FileInputStream;
import java.io.IOException;

public class LerArquivo {
	public static void main(String[] args) {
		FileInputStream in;
		try {
			in = new FileInputStream("arquivo.txt");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			System.out.println("Error ao abrir arquivo");
		}
	}
}