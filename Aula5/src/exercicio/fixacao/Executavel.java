package exercicio.fixacao;

import javax.swing.JOptionPane;

public class Executavel {
	
	public static String [] listaOpcoes = {"Quadrado","Retangulo","Circulo"};
	
	
	
	public static int selecionarObjeto(){
		int objeto = JOptionPane.showOptionDialog(null, "Qual a forma geometrica deseja criar?", "Opinião", JOptionPane.DEFAULT_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, listaOpcoes, null);
		
		return objeto;
	}
	
	
	
	public static FormaGeometrica criarObjetoSelecionado(int indice){
		double n,n1;
		
		switch (indice) {
		case 0:
			n = solicitarDados("Insira o lado do Quadrado");
			return new Quadrado(n); 
		case 1:
			n = solicitarDados("Insira a base do Retangulo");
			n1 = solicitarDados("Insira o altura do Retangulo");
			return new Retangulo(n,n1); 
		case 2:
			n = solicitarDados("Insira o raio do Circulo");
			return new Circulo(n);  
		}
		return null;
	}
	
	
	public static double solicitarDados(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int numeroDoArray = selecionarObjeto();
		FormaGeometrica obj = criarObjetoSelecionado(numeroDoArray);
		JOptionPane.showMessageDialog(null, "Perimetro é "+obj.calcularPerimetro());
		JOptionPane.showMessageDialog(null, "Area é "+obj.calcularArea());
		
	
	}
	

}
