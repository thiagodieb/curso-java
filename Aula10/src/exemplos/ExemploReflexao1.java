package exemplos;

public class ExemploReflexao1 {
	public static void main(String[] args) {

		Pessoa cremilda = new Pessoa();
		Class c = Pessoa.class;
		Class c2 = cremilda.getClass();
		Class c3 = new Pessoa().getClass();
	
		
		try {
			Class c4 = Class.forName("exemplos.Pessoa");
		} catch (ClassNotFoundException e) {
				System.out.println("Classe não encontrada");

		}
		

	}
}