package exemplos;

class A {
	public int variavelA;

	public A() {
		System.out.println("Classe_A_Construtor");
		variavelA = 1;
	}

	class B {
		public B() {
			System.out.println("Classe_B_Construtor");
			variavelA = 2;
		}
	}
}
