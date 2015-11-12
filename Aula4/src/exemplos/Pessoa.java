package exemplos;
public class Pessoa {

	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	private String nome;
	private double altura;
	private double peso;
	private String profissao;
	private int telefone;
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getAltura(){
		return this.altura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	
	public Pessoa(){
		System.out.println("Primeiro tipo");
	}
	
	public Pessoa(String nome, String profissao){
		this.nome = nome;
		this.profissao = profissao;
		System.out.println("Segundo tipo");
	}
	
	public void retornarDados(){
		System.out.println("Nome:"+this.nome);
		System.out.println("Profissao:"+this.profissao);
		System.out.println("Altura:"+this.altura);
		System.out.println("Peso:"+this.peso);
		System.out.println("Telefone:"+this.telefone);
		
	}
	public void inclirDados(String n, String p, int t, double a, double pe){
		this.nome = n;
		this.profissao = p;
		this.telefone = t;
		this.peso = pe;
		this.altura = a;
		
	}
	
	public String retornarNome(){
		return this.nome; 
	}
	
	public void incluirNome(String valor){ 
		if(valor.length() > 5){
			this.nome = valor;	
		} 
	}
	
}
