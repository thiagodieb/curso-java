package exercicio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) throws ParseException {

		int quatidadeDeDatas = 5;
		String [] sdatas = new String[quatidadeDeDatas];
		
		for (int i = 0; i < quatidadeDeDatas; i++) {
			sdatas[i] = JOptionPane.showInputDialog("Por favor insira uma data na posicao :"+i);
			if(!validarData(sdatas[i])){
				i = --i;
				JOptionPane.showMessageDialog(null, "Sua data está errada, utilize DD/MM/YYYY");
				continue;
			}
		}
		
		//String [] sdatas = {"06/27/2107","06/27/2002","06/27/2045","06/27/2012","06/27/1912"};
		
		Date [] datas = new Date[sdatas.length];
		
		for (int i = 0; i < sdatas.length; i++) {
			SimpleDateFormat formatter  = new SimpleDateFormat("MM/dd/yyyy");
			datas[i] = (Date) formatter.parse(sdatas[i]);	
		}
		
		Date maiorData;
		Date menorData;
		
		maiorData = datas[0];
		menorData = datas[0];
		
		for (int i = 0; i < datas.length; i++) {
			if(datas[i].getTime() > maiorData.getTime()){
				maiorData = datas[i];
			}
			if(datas[i].getTime() < menorData.getTime()){
				menorData = datas[i];
			}
		}
		
		System.out.println(maiorData);
		System.out.println(menorData);
		
	}
	
	public static boolean validarData(String date){
		
		int dia = Integer.parseInt(date.substring(0,2));
		int mes = Integer.parseInt(date.substring(3,5));
		int ano = Integer.parseInt(date.substring(6,10));
		
		if(date.substring(2, 3).equals("/") && date.substring(5, 6).equals("/")){
			if((dia >=1 && dia <=31) 
				&& (mes >=1 && mes <=12)
				&& (ano >=1)){
				return true;
			}
		}
		/*
		System.out.println(dia);
		System.out.println(mes);
		System.out.println(ano);*/
		return false;
	}
}
