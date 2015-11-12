package pacote2;

import exemplos.Pessoa;
import pacote1.Carro;

public class Exemplo1 {
 
	public static void main(String[] args) {
		
		
		Pessoa variavel;
		variavel =new Pessoa();
		
		
		variavel.nome = "Cremilda";
		System.out.println(variavel.nome);
		
		Carro ca = new Carro();
		ca.modelo = "uno";
		ca.incluirValores("FIAT", 130.00, 13);
		ca.imprimirDetalhes();
		
		//ca.marca = "Fiat";
		//ca.polegadasRodas = 10;
		//ca.potencia = 10.0;
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		variavel.incluirNome("Joaquim");
		//System.out.println(variavel.nome);
		System.out.println(variavel.retornarNome());
		System.out.println(variavel.nome);*/
		

	}

}
