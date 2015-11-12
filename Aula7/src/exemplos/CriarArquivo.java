package exemplos;

import java.io.*;

public class CriarArquivo {
	public static void main(String[] args) {
		try {
			File file = new File("teste/exemplo.txt");
			if (file.createNewFile()) {
				System.out.println("Arquivo criado");
			} else {
				System.out.println("Arquivo existente");
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}