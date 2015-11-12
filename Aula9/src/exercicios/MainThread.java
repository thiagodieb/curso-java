package exercicios;

public class MainThread {
	
	public static void main(String[] args) {
		new ThreadExercicio("Thread 2", 50, 900).start();
		new ThreadExercicio("Thread 1", 0, 1000).start();
	}

}

