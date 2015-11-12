class ClassesAninhadas4 {
	public static void main(String[] args) {
		G objG = new G() {
			public void teste() {
				System.out.println("Metodo Teste.");
			}
		};
		objG.teste();
	}
}
