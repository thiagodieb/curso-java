package exemplos;

class ClassesAninhadas2 {
	public static void main(String[] args) {
		C objC = new C();
		System.out.println(objC.variavelC);

		objC.interna();
		//Object d = objC.interna();
		//System.out.println(d);
		///D d2 = (D) d;
		
		System.out.println(objC.variavelC);
		
		C2 objc2 = new C2();
		objc2.interna();
		
		
	}
}