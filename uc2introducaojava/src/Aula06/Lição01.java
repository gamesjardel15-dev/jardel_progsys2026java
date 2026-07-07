package Aula06;
import java.util.Scanner;
public class Lição01 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        int numero;

	        System.out.print("Digite um número para ver a tabuada: ");
	        numero = entrada.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }

	        entrada.close();

	}

}
