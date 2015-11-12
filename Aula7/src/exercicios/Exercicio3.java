package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.xml.soap.Text;

public class Exercicio3 {
	public static void main(String[] args) {

		BufferedWriter outputStream = null;
		BufferedReader inputStream = null;
		
		String nomeDoArquivo = JOptionPane.showInputDialog("Insira o nome do arquivo a ser copiado");
		StringBuffer text = new StringBuffer("");

		try {
			inputStream = new BufferedReader(new FileReader(nomeDoArquivo));
			String line;
			while ((line = inputStream.readLine() ) != null) {
				text.append(line+"\n");	
			}
			
		} catch (IOException e) {
			System.out.println("Error ao abrir arquivo");
		}

		try {
			outputStream = new BufferedWriter(new FileWriter(
					"exercicio_3_arquivo.txt"));

			outputStream.write(text.toString());

			outputStream.close();
			
			JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso");
		} catch (IOException e) {
			System.out.println("Error ao salvar o arquivo");
		}
		
	}
}
