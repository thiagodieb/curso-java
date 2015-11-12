package exercicios;

public class ThreadExercicio2_1 extends Thread{
	
	public static boolean controlador;
	
	public void run() {
		controlador = true;
		int i = 0;
		while (controlador) {
			System.out.println("Conta "+i);
			i++;
		}
		System.out.println("\nTerminei de Contar!");
	}
	

}
