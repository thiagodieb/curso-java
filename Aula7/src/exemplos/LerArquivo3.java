package exemplos;

import java.io.*;

public class LerArquivo3 {
	public static void main(String[] args) {
		BufferedReader inputStream = null;
		try {
			
			inputStream = new BufferedReader(new FileReader("arquivo.txt"));

			String line;
			while ((line = inputStream.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error ao abrir arquivo");
		}
		
		
	}
}