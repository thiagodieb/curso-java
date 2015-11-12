package exercicios;

import javax.swing.JOptionPane;

public class MainExercicio2 {
	
	public static void main(String[] args) {
		
		
		ThreadExercicio2_1 t = new ThreadExercicio2_1();
		ThreadExercicio2_2 t2 = new ThreadExercicio2_2();
		int res = JOptionPane.showConfirmDialog(null, "Começar a contar?");
		if(res == 0){
			t.start();
			t2.start();
		}
	}

}
