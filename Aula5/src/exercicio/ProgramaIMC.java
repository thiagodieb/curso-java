package exercicio;

import javax.swing.JOptionPane;

public class ProgramaIMC {
	public static void main(String[] args) {
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira seu peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira seu altura"));
		
		String res = new IMC(altura, peso).resultado();
		
		JOptionPane.showMessageDialog(null, res);
	}

}
