package exemplos;

import javax.swing.JOptionPane;

public class Imput {
	public static void main(String[] args) {
		String resposta;
		resposta = JOptionPane.showInputDialog("Qual curso está fazendo ?");
		System.out.println(resposta);
		
		JOptionPane.showMessageDialog(null,resposta);
		
		JOptionPane.showConfirmDialog(null, "Você está aprendendo java ?");
		
		 
		String [] listaOpcoes = {"Horrível","Ruim","Péssimo"};
		
		int resposta2 = JOptionPane.showOptionDialog(null, "Opinião sobre Curso?", "Opinião", JOptionPane.DEFAULT_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, listaOpcoes, null);
		
		JOptionPane.showMessageDialog(null,listaOpcoes[resposta2]);

	}

}
