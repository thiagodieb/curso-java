package exemplos;

public class Generica {
	public static void main(String[] args) {
		TipoD<String> tStr = new TipoD<String>();
		tStr.setTipo("Aula de Programacao");
		
		System.out.println("Tipo String:" + tStr.getTipo());
		
		TipoD<Integer> tInt = new TipoD<Integer>();
		tInt.setTipo(1234);
		
		TipoD<Pessoa> pessoa  = new TipoD<Pessoa>();
		pessoa.setTipo(new Pessoa());

	}
}
