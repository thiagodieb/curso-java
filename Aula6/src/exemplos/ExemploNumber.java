package exemplos;

import java.text.NumberFormat;

public class ExemploNumber{

  public static void main(String []args){

    double n = 0.876;

    NumberFormat z = NumberFormat.getCurrencyInstance();
    System.out.println(z.format(n));
    z = NumberFormat.getNumberInstance();
    System.out.println(z.format(n));
    z = NumberFormat.getIntegerInstance();
    System.out.println(z.format(n));
    z = NumberFormat.getPercentInstance();
    System.out.println(z.format(n));
  }

}