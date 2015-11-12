package exercicio;

public class ExecutavelConta {
	
	public static void main(String[] args) {
		
		Conta c = new Conta("Cremilda",1223,10000,100,5000);
		System.out.println(c.getNomeCliente());
		System.out.println(c.getNumeroConta());
		System.out.println(c.getSalario());
		System.out.println(c.getSaldo());
		System.out.println(c.getLimite());
		
 		ContaEspecial c2 = new ContaEspecial("Jurescliude",1223,5000,600,20000);
		System.out.println(c2.getNomeCliente());
		System.out.println(c2.getNumeroConta());
		System.out.println(c2.getSalario());
		System.out.println(c2.getSaldo());
		System.out.println(c2.getLimite());
		
		 System.out.println("*******");
		 System.out.println("visa");

		Cartao visa = new Cartao(12333, c);
		System.out.println(visa.saldo(12333));
		System.out.println(visa.retirada(11111, 100));
		System.out.println(visa.retirada(12333, 100));
		System.out.println(visa.retirada(12333, 9000));
		System.out.println(visa.saldo(12333));
		System.out.println("master");
		Cartao master = new Cartao(66666, c);
		System.out.println(master.saldo(66666));
		System.out.println(master.retirada(66666111, 100));
		System.out.println(master.retirada(66666, 1100));
		System.out.println(master.saldo(66666));
		
		System.out.println(visa.saldo(12333));
		
		
	}

}
