package exercicio;

public class Conta {
	
	private String nomeCliente;
	private int numeroConta;
	private double salario;
	private double saldo;
	private double limite;
	
	public Conta(String nome, int numero, double salario, double saldo, double limite){
		this.setNomeCliente(nome);
		this.setNumeroConta(numero);
		this.setSalario(salario);
		this.setSaldo(saldo);
		this.setLimite(limite);
		System.out.println("Modo Completo");
	}
	public Conta(){
		System.out.println("Modo sem argumentos");
	}
	public void setNomeCliente(String nome){
		this.nomeCliente = nome;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta){
		this.numeroConta = Integer.parseInt(numeroConta);
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSaldo() {
		return saldo+this.getLimite();
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if(this.getSalario() >= limite){
			this.limite = limite;	
		}else{
			this.limite = this.getSalario();
		}
	}
	
	public double saldo(){
		return this.getSaldo();
	}
	
	public boolean retirar(double valor){
		if(this.getSaldo() >= valor){
 			this.setSaldo(this.saldo-valor);
 			return true;
		}
		return false;
		
	}
	
	public void depositar(double valor){
		this.setSaldo(valor +this.getSaldo());
		//this.setSaldo(valor +this.saldo);
		//this.saldo = valor +this.saldo;
	}
	

}






