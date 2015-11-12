package exercicios;

public class Utilitarios {
	
	private int [] valores;
	private int somaTemporaria = 0;
	
	
	
	
	public void converterValores(String [] valores){
		this.valores = new int[valores.length];
				
		for (int i = 0; i < valores.length; i++) {
			this.valores[i] = Integer.parseInt(valores[i]);
		}	
	}
	public void percorrerLista(int func){
		for (int i = 0; i < this.valores.length; i++) {
			switch (func) {
			case 1:
				this.somaValores(this.valores[i]);
				break;
			case 2:
				this.listarPositivos(this.valores[i]);
			break;
			case 3:
				this.listarNegativos(this.valores[i]);
			break;
			}
			
			//System.out.println(this.valores[i]);
		}	
	}
	
	public void listarPositivos(int valor){
		if(valor > 0){
			System.out.println(valor);
		}
		
	}
	
	public void listarNegativos(int valor){
		if(valor < 0){
			System.out.println(valor);
		}
	}
	
	public void somaValores(int valor){
		this.somaTemporaria = valor + this.somaTemporaria;
	}
	
	public double calcularMedia(){
		double media = this.somaTemporaria / this.valores.length;
		return media;
	}
	
	

}
