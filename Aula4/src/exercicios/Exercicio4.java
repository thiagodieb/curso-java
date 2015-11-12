package exercicios;
 

public class Exercicio4 {
 
	public static void main(String[] args) {
 
		int [] notas = new int[10];
		
		for (int i = 0; i < 10 ; i++) {
			//System.out.println(args[i]);
			notas[i] = Integer.parseInt(args[i]);
		}
		
		for(int j = 0; j < 10;j++){
			System.out.print("Aluno "+j+ " : "+ notas[j]);
			
			for (int estrela = 0; estrela < notas[j]; estrela++) {
				System.out.print("*");
			}
			System.out.println("");
			//System.out.println(notas[j]);
		}
		
			/*int notas1 = Integer.parseInt(args[0]);
			int notas2 = Integer.parseInt(args[1]);
			int notas3 = Integer.parseInt(args[2]);
			int notas4 = Integer.parseInt(args[3]);
			int notas5 = Integer.parseInt(args[4]);
			int notas6 = Integer.parseInt(args[5]);
			int notas7 = Integer.parseInt(args[6]);
			int notas8 = Integer.parseInt(args[7]);
			int notas9 = Integer.parseInt(args[8]);
			int notas10 = Integer.parseInt(args[9]);*/
	}

}
