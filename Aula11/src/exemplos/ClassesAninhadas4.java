package exemplos;

class ClassesAninhadas4 {
	public static void main(String[] args) {
		System.out.println(new G() {
			
			public void teste() {
				System.out.println("Metodo Teste.");
			}
			public void imprimir(){
				System.out.println("Nova class");
			}
			
		});
		
		System.out.println(new G());
				
	}
}
