package exercicios;

public class Utilitarios2 {
	
	private int [] valores; 
	 
	public void converterValores(String [] valores){
		this.valores = new int[valores.length];
				
		for (int i = 0; i < valores.length; i++) {
			this.valores[i] = Integer.parseInt(valores[i]);
		}	
	} 
	
	public void listarPositivos(){
		System.out.println("Positivos");
		for (int i = 0; i < this.valores.length; i++) {
			if(this.valores[i] > 0){
				System.out.println(this.valores[i]);
			}
		}
	}
	
	public void listarNegativos(){
		System.out.println("Negativos");
		for (int i = 0; i < this.valores.length; i++) {
			if(this.valores[i] < 0){
				System.out.println(this.valores[i]);
			}
		}
	}
	  
	public void calcularMedia(){
		
		System.out.println("Media");
		int soma = 0;
		for (int i = 0; i < this.valores.length; i++) {
			  soma = this.valores[i] + soma;
		}
		double media = soma / this.valores.length;
		System.out.println(media);
	}
	
	public void listar150a300(){
		System.out.println("150 a 300");
		for (int i = 0; i < this.valores.length; i++) {
			if(this.valores[i] >= 150 && this.valores[i] <= 300){
				System.out.println(this.valores[i]);
			}
		}
	}
	
	public void listarMultiplos3(){
		System.out.println("Multiplos 3");
		for (int i = 0; i < this.valores.length; i++) {
			if(this.valores[i] % 3 == 0){
				System.out.println(this.valores[i]);
			}
		}
	}
	public void listarMultiplos4(){
		System.out.println("Multiplos 4 entre 1 e 100");
		for (int i = 0; i < this.valores.length; i++) {
			if(this.valores[i] % 4 == 0 && this.valores[i] >=1 && this.valores[i] <=100){
				System.out.println(this.valores[i]);
			}
		}
	}
	
	public void soma1a100(){
		
		System.out.println("Soma de 1 a 1000");
		int soma = 0;
		for (int i = 0; i < this.valores.length; i++) {
			if( this.valores[i] >=1 && this.valores[i] <=1000){
			  soma = this.valores[i] + soma;
			}
		}
		System.out.println(soma);
	}
}
