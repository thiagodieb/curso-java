package exemplos;

import javax.swing.JOptionPane;

public class Executavel {
	
	public static void main(String[] args) {
		
		
		Usuario u = new Usuario();
		
		String nome = null;
		int idade = 0 ;
		String cpf = null;
		try {
			nome = JOptionPane.showInputDialog("Insira o nome");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
			cpf = JOptionPane.showInputDialog("Insira o cpf");
			u.setNome(nome);
			u.setIdade(idade);
			
		} catch (InvalidArgsException e) {
			JOptionPane.showMessageDialog(null, e);
		} catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Dado invalido");
		}
		u.setCpf(cpf);

		
	}

}

