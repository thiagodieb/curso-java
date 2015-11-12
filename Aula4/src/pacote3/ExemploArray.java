package pacote3;

public class ExemploArray {
 
	public static void main(String[] args) {
			
		Televisao [] caminhaDeTelevisao;
		caminhaDeTelevisao = new Televisao[10];
		

		caminhaDeTelevisao[0] = new Televisao();
		caminhaDeTelevisao[0].marca = "LG";
		caminhaDeTelevisao[0].modelo = " JDHSN101";
		caminhaDeTelevisao[0].polegadas = 10.5;
		
		caminhaDeTelevisao[1] = new Televisao();
		caminhaDeTelevisao[1].marca = "Philips";
		caminhaDeTelevisao[1].modelo = " POIN101";
		caminhaDeTelevisao[1].polegadas = 10.5;
		 
		caminhaDeTelevisao[2] = new Televisao();
		caminhaDeTelevisao[2].marca = "Sony";
		caminhaDeTelevisao[2].modelo = " S_DD01";
		caminhaDeTelevisao[2].polegadas = 60.5;
		 
		caminhaDeTelevisao[0].todosOsDetalhes();
		caminhaDeTelevisao[1].todosOsDetalhes();
		caminhaDeTelevisao[2].todosOsDetalhes();
		 
		
		
		
		
	}

}
