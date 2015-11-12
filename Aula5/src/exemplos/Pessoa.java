package exemplos;

public class Pessoa extends SerVivo {
	
	
	public Pessoa(){
		System.out.println("criando objeto Pessoa");
	}
		
	private String nome;
	private int idade;
	
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	public String getNome(){
		return this.nome;
		
	}
	public int getIdade(){
		return this.idade;
	}

	@Override
	public String modoDeLocomocao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
