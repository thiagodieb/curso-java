
public class Televisao {

	public String serial;
	public String cor;
	public double polegadas;
	public String descricao;
	public String marca;
	public double canal;
	public boolean status;
	public int volume;
	
	
	public void todosOsDetalhes(){
		System.out.println("Serial :"+this.serial);
		System.out.println("Cor :"+this.cor);
		System.out.println("Polegadas :"+this.polegadas);
		System.out.println("Descricao :"+this.descricao);
		System.out.println("Canal :"+this.canal);
		System.out.println("Volume :"+this.volume);
		System.out.println("Status :"+this.status);
		
	}
	
	public void ligar(){
		this.status = true;
	}
	
	public void desligar(){
		this.status = false;
	}
	
	public void mudarCanal(double canal){
		System.out.println("valor recebido:" +canal);
		System.out.println("valor do atributo:" +this.canal);
	}
	
	public void aumentarVolume(){
		this.volume = this.volume+1;
		//System.out.println("Estou aumentando o volume......");
		
	}
	public void diminuirVolume(){
		this.volume = this.volume-1;
		//System.out.println("Estou diminuindo o volume......");
	}
	
}
