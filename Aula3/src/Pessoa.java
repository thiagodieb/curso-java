
public class Pessoa {
	
	public String nome;
	public int idade;
	public String sexo;
	public String profissao;
	
	
	public void montarDados(){
		System.out.println("Nome da Pessoa :"+this.nome);
		System.out.println("Idade:"+this.idade);
		System.out.println("Sexo:"+this.sexo);
		System.out.println("Profissao:"+this.profissao);	
	}
	public void apagarDados(){
		this.idade = 0;
		this.sexo = "";
		this.profissao = "";
		this.nome = "";
	}
	
	
	public void imprimirNome(String valor){
		System.out.println(valor);
	}
	
	
}
