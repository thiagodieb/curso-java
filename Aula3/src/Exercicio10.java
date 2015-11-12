
public class Exercicio10 {

	 
	public static void main(String[] args) {
	
		/*Tv 1 */
		Televisao tv1;
		tv1 = new Televisao();
		tv1.cor = "Vermelho";
		tv1.volume = 10;
		
		/*Tv 2 */
		Televisao tv2;
		tv2 = new Televisao();
		tv2.cor = "Azul";
		
		//tv2.mudarCanal(300);
		
		/*Tv 3 */
		Televisao tv3 = new Televisao();
		tv3.canal = 2222.0;
		tv3.ligar();
		tv3.aumentarVolume();
		tv3.aumentarVolume();
		tv3.aumentarVolume();
		tv3.diminuirVolume();
		
		//tv3.aumentarVolume();
		//tv3.mudarCanal(101.3);
		/*new Televisao().cor = "Preto";
		System.out.println(new Televisao().cor);
		
		*/
		
		tv1.todosOsDetalhes();
		System.out.println("*****");
		tv2.todosOsDetalhes();
		System.out.println("*****");
		tv3.todosOsDetalhes();
		
		

	}

}
