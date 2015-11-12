package exemplos;

public class Usuario {
	
	private String nome;
	private int idade;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws InvalidArgsException {
		if(nome.length() < 5){
			throw new InvalidArgsException("Valor de nome deve ser maior que 5");
		}
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) throws InvalidArgsException {
		if(idade <= 0){
			throw new InvalidArgsException("Valor de idade deve ser maior que 0");
		}
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
