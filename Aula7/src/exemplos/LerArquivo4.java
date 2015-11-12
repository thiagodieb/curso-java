package exemplos;

import java.io.*;
import java.util.Date;

public class LerArquivo4 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("arquivo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Pessoa j = (Pessoa) ois.readObject();
			
			ois.close();
			
			System.out.println(j.nome);
			System.out.println(j.idade);

		} catch (Exception e) {
			System.out.println("Error ao salvar o arquivo");
		}
	}
}
