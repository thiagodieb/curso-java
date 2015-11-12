package exercicio;

import javax.swing.JOptionPane;

public class ClasseMain {
	
	public static void main(String[] args) {
		
		String tipo = JOptionPane.showInputDialog("Qual lampada deseja criar ?");
		FabricaDeLampada f = new FabricaDeLampada();
		Lampada l = f.construir(tipo);
		
		l.ligar();
		l.desligar();
		
		
	
	}

}
