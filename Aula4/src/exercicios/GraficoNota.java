package exercicios;

public class GraficoNota {
	
	public int[] notas;
	private int quantidadeDeNotas;
	private String simbolo;
	
	public void iniciarExecucao(String [] notasEmString,int quantidade, String simbolo){
		this.simbolo = simbolo;
		this.quantidadeDeNotas = quantidade;
		this.converteValores(notasEmString);
		this.listarAlunos();
	}
	
	private void converteValores(String [] notasEmString){
		
		this.notas = new int[this.quantidadeDeNotas];
		
		for (int i = 0; i < this.quantidadeDeNotas ; i++) { 
			notas[i] = Integer.parseInt(notasEmString[i]);
		} 
		
	}
	
	protected void listarAlunos(){
		for(int j = 0; j < this.quantidadeDeNotas;j++){
			System.out.print("Aluno "+(j+1)+ " : ");
			this.imprimiEstrelas(this.notas[j]);
			System.out.println("");
			  
		}
	} 
	
	private void imprimiEstrelas(int notaDoAluno){
		
		for (int estrela = 0; estrela < notaDoAluno; estrela++) {
			System.out.print(this.simbolo);
		}	
		
	}
	

}

