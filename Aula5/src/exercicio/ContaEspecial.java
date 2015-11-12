package exercicio;

public class ContaEspecial extends Conta{

	private double limite;
	
	public ContaEspecial(String nome, int numero, double salario, double saldo,
			double limite) {
		
		super(nome, numero, salario, saldo, limite);
	}

/*	public ContaEspecial(){
		super();
	}
	*/
	
	
	public void setLimite(double limite) {
		if((this.getSalario()*3) >= limite){
			this.limite = limite;	
		}else{
			this.limite = this.getSalario()*3;
		}
	}
	public double getLimite(){
		return this.limite;
	}
}
