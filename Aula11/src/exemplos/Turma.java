package exemplos;

public class Turma {

	enum Periodo {
		Manha, Tarde, Noite
	}

	public Periodo periodo;
	public String nome;
	public DiasDaSemana dia;

	public Turma(Periodo p, String n, DiasDaSemana d) {
		this.periodo = p;
		this.nome = n;
		this.dia = d;

	}

	public static void main(String[] args) {

		Turma t = new Turma(Periodo.Tarde, "Java", DiasDaSemana.Sabado);
		System.out.println(t.dia);
		System.out.println(t.dia.reduzido);

	}
}
