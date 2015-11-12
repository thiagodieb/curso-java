package exemplos;

class C {
	public int variavelC;

	public C() {
		System.out.println("Classe_C_Construtor");
		variavelC = 3;
	}

	public void interna() {
		class D {
			public D() {
				System.out.println("Classe_D_Construtor");
				variavelC = 4;
			}
		}
		D objD = new D();
	}
}
