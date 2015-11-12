package exercicio;

public class Cartao {
	
	private int senha;
	private Conta conta;
	 
	
	public int getSenha() {
		return senha;
	}
 
	public void setSenha(int senha) {
		this.senha = senha;
	}
  
	public Conta getConta() {
		return conta;
	} 

	public void setConta(Conta conta) {
		this.conta = conta;
	} 
	public boolean validarSenha(int senha){
		if(senha == this.getSenha()){
			return true;
		}
		return false;
	}
	
	public Cartao(int senha, Conta conta){
		this.setSenha(senha);
		this.setConta(conta);
		
	}
	
	public boolean retirada(int senha, double valor){
		if(this.validarSenha(senha)){
			return this.getConta().retirar(valor);
		}
		return false;
	}
	
	public double saldo(int senha){
		if(this.validarSenha(senha)){
			return this.getConta().saldo();
		}
		return 0;
		
	}
	public boolean alterarSenha(int senha, int senhaNova){
		if(this.validarSenha(senha)){
			this.senha = senhaNova;
			return true;
		}
		return false;
	}

}
