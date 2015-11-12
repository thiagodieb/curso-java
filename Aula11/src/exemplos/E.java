package exemplos;

class E {
	public int variavelE;
	public static int variavelE2;

	public E() {
		System.out.println("Classe_E_Construtor");
		variavelE = 5;
	}

	static class F {
		public F() {
			System.out.println("Classe_F_Construtor");
			variavelE2 = 10;
		}
	}
}
