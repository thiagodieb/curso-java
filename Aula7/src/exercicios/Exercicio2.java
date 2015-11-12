package exercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		BufferedWriter outputStream = null;
		
		String msg = JOptionPane.showInputDialog("Por favor, insira um texto");
		
		try {
			outputStream = new BufferedWriter(new FileWriter("exercicio_2_arquivo.txt"));
			
			outputStream.write(msg);
			
			outputStream.close();
			JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso");
		} catch (IOException e) {
			System.out.println("Error ao salvar o arquivo");
		}

	}

}
