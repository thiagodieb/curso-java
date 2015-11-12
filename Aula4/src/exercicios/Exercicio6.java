package exercicios;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Triangulo t = new Triangulo();
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		
		t.inserirDado(a,b);
		double area = t.calculoDeArea();
		
		System.out.println("A area do triangulo e : " + area);
		
	}

}
