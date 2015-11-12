package exercicios;


/* Definição do espoco da classe generica, para aceitar 
 * somente objetos filhos da classe com heranca de ViewerData
 */
public class DisplayObject<D extends ViewerData> {
	
	private D qualquer;
	
	public DisplayObject(D variavel){
		this.qualquer = variavel;
	}
	
	public void display(){
		//System.out.println(this.qualquer);
		System.out.println(this.qualquer.toString());
	}
	

}
