package exemplos;

public class Exemplo1 {

	
	public static void main(String[] args) {
		
		Pessoa cre = new Pessoa();
		cre.setIdade(50); 
		System.out.println(cre.getIdade());
		
		System.out.println("********");
		Aluno jose = new Aluno();
		jose.setNome("Jose da Silva");
		jose.setMatricula(123123);
		System.out.println(jose.getNome());
		System.out.println(jose.getMatricula());
		
		System.out.println("********");
		
		AlunoMestrado roberto = new AlunoMestrado();
		
		
		
	}
}
