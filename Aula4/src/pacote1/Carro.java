package pacote1;
public class Carro {
 
		
	  public String modelo;
	  String marca;
	  private double potencia;
	  protected int polegadasRodas;
	  
	  
	  private void imprimirAtributo(String nomeDoAtributo){
		  System.out.print(nomeDoAtributo);
	  }
	  
	  public void incluirValores(String m, double p, int pr){
		  this.marca = m;
		  this.potencia = p;
		  this.polegadasRodas = pr;
		  
	  }
	  
	  public void imprimirDetalhes (){
		  this.imprimirAtributo("Modelo:");
		  System.out.println(this.modelo);
		  this.imprimirAtributo("Marca:");
		  System.out.println(this.marca);
		  this.imprimirAtributo("Potencia:");
		  System.out.println(this.potencia);
		  this.imprimirAtributo("Polegada das Rodas:");
		  System.out.println(this.polegadasRodas);
		  
	  }

}

