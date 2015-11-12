package exercicios;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		/*Utilitarios u =  new Utilitarios();
		
		u.converterValores(args);
		u.percorrerLista(1);
		
		System.out.println("Media:"+u.calcularMedia());
		System.out.println("Positivos");
		u.percorrerLista(2);
		System.out.println("Negativos");
		u.percorrerLista(3);*/
		
		Utilitarios2 u2 = new Utilitarios2();
		u2.converterValores(args);
		u2.listarNegativos();
		u2.listarPositivos();
		u2.calcularMedia();
		u2.listar150a300();
		u2.listarMultiplos3();
		u2.listarMultiplos4();
		u2.soma1a100();
	}

}
