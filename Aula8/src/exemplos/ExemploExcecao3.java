package exemplos;

import javax.swing.JOptionPane;

public class ExemploExcecao3 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(JOptionPane
					.showInputDialog("Quer dividir 42 por quanto?"));
			int b = 42 / a;
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, e);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
