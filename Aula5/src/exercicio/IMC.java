package exercicio;

public class IMC {
	
	private double altura;
	private double peso;
	private double IMC;
	
	public IMC(double altura, double peso){
		this.setAltura(altura);
		this.setPeso(peso);
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void calcularIMC(){
		this.IMC = this.getPeso() / (this.getAltura()*this.getAltura());
	}
	
	public String resultado(){
		this.calcularIMC();
		
		String resultado = "";
		
		if(this.IMC < 18.5){
			resultado = "Abaixo do Peso";
		}else if(this.IMC >= 18.5 && this.IMC <=24.9){
			resultado = "Parabéns, peso ideal";
		}else if(this.IMC >= 25 && this.IMC <=29.9){
			resultado = "Sobrepreso";
		}else if(this.IMC >= 30 && this.IMC <=34.9){
			resultado = "Obesidade grau I";
		}else if(this.IMC >= 35 && this.IMC <=39.9){
			resultado = "Obesidade grau II";
		}else{
			resultado = "Obesidade grau III - está muito mal...";
		}
		
		return resultado;
	}

}
