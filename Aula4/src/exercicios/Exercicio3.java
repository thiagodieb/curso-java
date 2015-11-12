package exercicios;

public class Exercicio3 {
 
	
	
	
	public static void main(String[] args) {
		 
		
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int num3 = Integer.parseInt(args[2]);
			int num4 = Integer.parseInt(args[3]);
			int num5 = Integer.parseInt(args[4]);
			
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			
			
			Exercicio31 e = new Exercicio31();
			int maior = e.metodo1(num1,num2, num3, num4, num5);
			
			int maior2 = e.metodo2(num1,num2, num3, num4, num5);
			
			System.out.println("Maior = "+maior);
			System.out.println("Maior = "+maior2);
			
			
			
			

	}

}


