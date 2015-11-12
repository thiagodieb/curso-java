package exemplos;


class ClassesAninhadas1 {
	public static void main(String[] args) {
		A objA = new A();
		System.out.println(objA.variavelA);
		
		
		A.B objB = objA.new B();
		System.out.println(objA.variavelA);
		
		
		A2 objA2 = new A2();
		A2.B  objB2 = objA2.new B();
		
		A2.B b =  new A2().new B();
		A2.B2 b2 =  new A2().new B2();
		
		
		
	}
}



