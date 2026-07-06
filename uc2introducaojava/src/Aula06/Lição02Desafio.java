package Aula06;
import java.util.Scanner;
public class Lição02Desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Consultar produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu cadastrar produto.");
                    break;

                case 2:
                    System.out.println("Você escolheu listar produtos.");
                    break;

                case 3:
                    System.out.println("Você escolheu consultar produto.");
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();

        } while (opcao != 0);

        entrada.close();

	}

}
