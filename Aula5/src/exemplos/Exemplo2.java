package exemplos;

public class Exemplo2 {
	
	public static void main(String[] args) {
		
		
		Pessoa a = new Pessoa();
		
		Aluno b = new Aluno();
		b.setIdade(10);
		b.setNome("Julia");
		b.setMatricula(1109);
		
		Pessoa j =  b;
		
		
		System.out.println(j.getNome());
		System.out.println(j.getIdade());
		//System.out.println(j.getMatricula());
	}

}

