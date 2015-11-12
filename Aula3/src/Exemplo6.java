
public class Exemplo6 {

	public static void main(String[] args) {

		Pessoa objP;
		objP =  new Pessoa();

		objP.nome = "Cremilda";
		objP.idade = 50;
		
		Pessoa objP2 = objP;
		
		objP2.nome = "Jurema";
		objP2.idade = 10;
		
		System.out.println(objP);
		System.out.println(objP.idade);
		System.out.println(objP.nome);
		System.out.println("********************");
		System.out.println(objP2);
		System.out.println(objP2.nome);
		System.out.println(objP2.idade);
	}

}

