package exemplos;

import java.io.*;
import java.util.Date;

public class EscreverArquivo4 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Pessoa a = new Pessoa();
			a.nome = "Perolina";
			a.idade = 12;
			
			oos.writeObject(a);
			
			oos.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Error ao salvar o arquivo");
		}
	}
}