package exemplos;

import javax.swing.JOptionPane;

public class ExemploExcecao4 {
	public static void main(String[] args) {
		
		int a = 0;
		String msg = "";
		
		try {
			a = Integer.parseInt(JOptionPane
					.showInputDialog("Quer dividir 42 por quanto?"));
			int b = 42 / a;
			msg = "Execucao bem sucedida";
		} catch (ArithmeticException e) {
			msg = "Erro: divisao por zero";
		}catch (NumberFormatException e) {
			msg = "Erro: dado com formato invalido";
		}
		finally{
			
			//JOptionPane.showMessageDialog(null, msg);
			System.out.println(msg);
		}
	}
}
