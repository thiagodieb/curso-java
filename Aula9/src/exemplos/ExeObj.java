package exemplos;

public class ExeObj {
	
	public static void main(String[] args) {
		
		Macarrao obj = new Macarrao(1000);
		
		Pessoa tr1 = new Pessoa("Manuel");
		tr1.colocarNoPrato(obj);
		
		Pessoa tr2 = new Pessoa("Joaquim");
		tr2.colocarNoPrato(obj);
		
		Pessoa tr3 = new Pessoa("Cremilda");
		tr3.colocarNoPrato(obj);
		
		Pessoa tr4 = new Pessoa("Juvenal");
		tr4.colocarNoPrato(obj);
		
		tr2.start();
		tr1.start();
		tr4.start();
		tr3.start();

	}
}