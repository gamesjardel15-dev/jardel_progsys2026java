package Aula04;
import java.util.Scanner;
public class DesafioAula04_9 {

public static void main(String[] args) {
	double valorCompra = 500;
	double desconto = 5;
	double valorFinal;

	

	if (valorCompra >= 500) {
	    desconto = valorCompra * 10 / 100;
	} else if (valorCompra >= 300) {
	    desconto = valorCompra * 5 / 100;
	} else {
	    desconto = 0;
	}

	
	}

}
