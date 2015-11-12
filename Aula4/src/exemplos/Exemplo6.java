package exemplos;

public class Exemplo6 {

	
	public static void main(String[] args) {
		
		String nome  = args[0];
		int idade = Integer.parseInt(args[1]);
		String sexo = args[2];
		char sexo2 = args[2].charAt(0);
		
		
		//System.out.println(sexo2);
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(sexo);
		
		if( nome.equals("Cremilda") ){
			System.out.println("OK, você acertou");
		}else{
			System.out.println("ERROU seu BURRO>>>");
		}
		
		if(idade > 45){
			System.out.println("Esta quase velha....");
		}else{
			System.out.println("FIU FIU....");
		}
		
		if(sexo.equals("m") ){
			System.out.println("Masculino");
		}else{
			System.out.println("Feminino");
		}
		
		
		
		switch (sexo2) {
		case 'm':
			System.out.println("Masculino");
			break;
		case 'f':
			System.out.println("Feminino");
			break;
		default:
			break;
		}
		
		System.out.println(Character.getNumericValue(sexo2));
		
		
	}

}

