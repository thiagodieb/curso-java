package exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	
	public static void main(String[] args) {

		double[] vetor = new double[10];
		int valorVetor = Integer.parseInt(JOptionPane.showInputDialog("Quantidad de indices do vetor"));
		
		try{
			for (int i = 0; i < valorVetor ; i++) {
					vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
			}
		
		}catch(NumberFormatException e ){
			JOptionPane.showMessageDialog(null, "Erro do dado inserido");
			return;
		}catch (ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Erro na quantidade de indices");
			return;
		}
		
		for (int i = 0; i < valorVetor; i++) {
				JOptionPane.showMessageDialog(null, vetor[i]);
		}
		

	}

}
