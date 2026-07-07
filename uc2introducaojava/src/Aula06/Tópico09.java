package Aula06;
import java.util.Scanner;
public class Tópico09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();
        }

        System.out.println("===== NOMES CADASTRADOS =====");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }

        entrada.close();

	}

}
