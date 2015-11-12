package exemplos;

public class CarroStatic {
	
	public CarroStatic(){
		System.out.println("Criando objeto");
		CarroStatic.quantidadeDeVeiculos++;
		this.id =  CarroStatic.quantidadeDeVeiculos; 
	}
	
	public String modelo;
	public String marca;
	public int id;
	public static int quantidadeDeVeiculos;

	public String andar(){
		return "Carro com id:"+this.id+" está andando...";
	}
	public String parar(){
		return "Carro com id:"+this.id+" está parando...";
	}
	public static String carrosDeFabrica(){
		return "Quantidade de carros criados... : "+CarroStatic.quantidadeDeVeiculos;
	}
	
}
