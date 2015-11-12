package exemplos;

import java.text.DecimalFormat;

public class ExemploDecimal{

 public static void main(String []args){

    double valor = 20000.0 / 3.0;
    
    DecimalFormat df = new DecimalFormat("##,##,00.0");

    System.out.println("2000.0 / 3.0 = " +    df.format(valor));

  }

}