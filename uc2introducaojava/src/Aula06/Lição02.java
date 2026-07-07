package Aula06;
import java.util.Scanner;
public class Lição02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        String senha = "";

        while (!senha.equals("1234")) {
            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();

            if (!senha.equals("1234")) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        System.out.println("Acesso liberado.");

        entrada.close();

	}

}
