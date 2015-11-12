package exemplos;


public class Exemplo3 {

	 
	public static void main(String[] args) {
	
		String [] lista;
		lista = new String[3];
		
		lista[0] = "Tenison";
		lista[1] = "Riberval";
		lista[2] = "Cremilda";
		
		int [] numeros;
		numeros = new int[3];
		
		numeros[0] = 90;
		numeros[2] = 1230;
		numeros[1] = 4;
		

		Pessoa p = new Pessoa();
		p.nome = "Algum nome";
		
		Pessoa [] curso;
		curso = new Pessoa[3];
		
		curso[0] = p;
		curso[1] = new Pessoa();
		curso[2] = new Pessoa();
		
		curso[0].nome = "Outro nome";
		
		System.out.println(p.nome);

	}

}
