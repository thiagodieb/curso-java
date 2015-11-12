package exemplos;

public enum DiasDaSemana {

	Domingo("Dmg"),
	Segunda("Seg"),
	Terca("Ter"),
	Quarta("Quar"),
	Quinta("Quin"),
	Sexta("Sex"),
	Sabado("Sbd");
	
	String reduzido;
	
	DiasDaSemana(String r){
		this.reduzido = r;
	}
}

