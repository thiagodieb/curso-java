package exemplos;

import java.io.File;

public class ExcluirArquivo {
	public static void main(String[] args) {
		try {
			File file = new File("teste/exemplo.txt");
			System.out.println(file.getPath());
			if (file.delete()) {
				System.out.println(file.getName() + " excluido");
			} else {
				System.out.println("Exclusao falhou");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}