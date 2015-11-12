package exercicios;

import javax.swing.JOptionPane;

public class ThreadExercicio2_2 extends Thread{
 
	public void run() {
		while (true) {
			int res = JOptionPane.showConfirmDialog(null, "Parar  de contar?");
			if(res == 0){
				ThreadExercicio2_1.controlador = false;
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "Parei");
	}
	
}
