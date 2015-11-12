package exemplos;

public class Exemplo {
	
	public int valor = 10;
	
	
	public void teste(){
		System.out.println(this.valor);
	}
	public void teste2(){
		this.teste();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(12);
		
		new Exemplo().teste();
		
		this.teste();
		
		
	}

}
