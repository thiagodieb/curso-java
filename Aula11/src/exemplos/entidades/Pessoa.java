package exemplos.entidades;

import exemplos.annotations.Verificador;

public class Pessoa{
	private String nome;

	@Verificador(Type = "Validacao")
	public String getNome() {
		return this.nome;
	}
	@Verificador(Type = "Confirmacao")
	public void outroMetodo(){
		
		
	}
	@Override
	public String toString(){
		return null;
	}
	
	

}
