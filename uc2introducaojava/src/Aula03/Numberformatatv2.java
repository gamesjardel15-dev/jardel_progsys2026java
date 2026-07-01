package Aula03;
import java.text.NumberFormat;
public class Numberformatatv2 {

	public static void main(String[] args) {
		double valor = 1234.5;

        NumberFormat moeda = NumberFormat.getCurrencyInstance();

        System.out.println("Valor formatado: " + moeda.format(valor));	
      
	}

}
