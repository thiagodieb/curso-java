package exercicios;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		String diretorio = JOptionPane
				.showInputDialog("Insira o nome do diretorio");
		File file = new File(diretorio);
		file.mkdir();
		if (file.exists()) {
			JOptionPane.showMessageDialog(null, "Diretorio Criado");
		}
		
		String arquivo = JOptionPane
				.showInputDialog("Insira o nome do arquivo");
		
		File file2 = new File(diretorio+"/"+arquivo);
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
