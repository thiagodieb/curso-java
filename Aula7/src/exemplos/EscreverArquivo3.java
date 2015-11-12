package exemplos;
import java.io.*;

public class EscreverArquivo3{
    public static void main(String[] args) {
        BufferedWriter outputStream = null;

        try {
          	outputStream = new BufferedWriter(new FileWriter("arquivo.txt"));

            String l = "Meu terceiro arquivo";
			outputStream.write(l);
			outputStream.close();
        } catch(IOException e){ 
      	      System.out.println("Error ao salvar o arquivo"); 
		}
    }
}