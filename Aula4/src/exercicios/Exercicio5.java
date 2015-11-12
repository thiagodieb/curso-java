package exercicios;
import exemplos.Pessoa;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		
		Pessoa p = new Pessoa();
		
		String nome = args[0];
		String profissao = args[1];
		int telefone = Integer.parseInt(args[2]);
		double altura = Double.parseDouble(args[3]);
		double peso = Double.parseDouble(args[4]);
		
		p.inclirDados(nome, profissao, telefone, altura, peso);
		p.retornarDados();
		
		
		
	}

}
