package exemplos;

public class ExemploStatic {
	
	
	public String valor = "10...";
	
	
	public void teste(){
		System.out.println(this.valor);
	}
	
	public static void main(String[] args) {
		
		
		CarroStatic fusca =  new CarroStatic();
		fusca.modelo = "Fusca 1300";
		fusca.marca = "VW";
		
		System.out.println(fusca.andar());
		System.out.println(fusca.modelo);
		
		
		
		CarroStatic strada =  new CarroStatic();
		strada.modelo = "Strada 1.8";
		strada.marca = "Fiat";
		
		System.out.println(strada.andar());
		System.out.println(strada.modelo);
		
		System.out.println(fusca.modelo);
		CarroStatic a  = new CarroStatic();
		System.out.println(a.id);
		new CarroStatic();
		new CarroStatic();
		new CarroStatic();

		
		 
		System.out.println(CarroStatic.quantidadeDeVeiculos);
		System.out.println(strada.id);
		System.out.println(a.id);
		
		System.out.println(CarroStatic.carrosDeFabrica());
		
	}

}





