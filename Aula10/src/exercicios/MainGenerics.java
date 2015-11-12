package exercicios;

public class MainGenerics {
	
	public static void main(String[] args) {
		
		DisplayObject d1 = new DisplayObject(new Curso("Programacao Java ", "Manha"));
		DisplayObject<ViewerData> d2 = new DisplayObject<ViewerData>(new Mobile("LG gj4454"));
		
		d1.display();
		d2.display();
		
	}

}
