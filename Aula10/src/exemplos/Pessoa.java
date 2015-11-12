package exemplos;

public class Pessoa extends SerHumano{
	public String nome;
	public int rg;
	private int idade;
	private String nomeMae;

	public void setNomes(String nome, String nomeMae) {
		this.nome = nome;
		this.nomeMae = nomeMae;
	}

	private void fazerRg() {
		this.rg = this.idade * 2 + 3434324 / 4 * 5;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
