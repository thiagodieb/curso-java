package exercicios;

public class Exercicio31 {

 
	public int metodo1(int n1, int n2, int n3, int n4, int n5){
		
		int x, y, z, maior = 0;
		
		if(n1 > n2){
			x = n1;
		}else{
			x = n2;
		}
		
		if(n3 > n4){
			y = n3;
		}else{
			y = n4;
		}
		
		if(x > y){
			z = x;
		}else{
			z = y;
		}
		
		if(z > n5){
			maior = z;
		}else{
			maior = n5;
		}
		
		return maior; 
	} 
	
	
	public int metodo2(int n1, int n2, int n3, int n4, int n5){

		int maior = 0;
		if(n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5){
			maior = n1;
		}else{
			if(n2 > n3 && n2 > n4 && n2 > n5){
				maior = n2;
			}else{
				if(n3 > n4 && n3 > n5){
					maior = n3;
				}else{
					if(n4>n5){
						maior = n4;
					}else{
						maior = n5;
					}
				}
			}
		}
		
		/*if(n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5){
			
		}else if (n2 > n3 && n2 > n4 && n2 > n5) {
			
		}else if(){
			
		}*/
		
		return maior;
	}
	
}












