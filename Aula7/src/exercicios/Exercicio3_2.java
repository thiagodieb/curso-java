package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.xml.soap.Text;

public class Exercicio3_2 {
	public static void main(String[] args) {

		String nomeDoArquivo = JOptionPane
				.showInputDialog("Insira o nome do arquivo a ser copiado");

		File file = new File("exercicio_3_arquivo.txt");
		File file2 = new File("exercicio_4_arquivo.txt");
		file.renameTo(file2);
		
	}
}
