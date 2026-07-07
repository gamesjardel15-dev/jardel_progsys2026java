package Aula06;
import java.util.ArrayList;
import java.util.Scanner;
public class Tópico13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("===== MENU PRODUTOS =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String produto = entrada.nextLine();

                    produtos.add(produto);

                    System.out.println("Produto cadastrado com sucesso.");
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("===== LISTA DE PRODUTOS =====");

                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println((i + 1) + " - " + produtos.get(i));
                        }
                    }
                    break;

                case 3:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto para remover.");
                    } else {
                        System.out.println("===== PRODUTOS CADASTRADOS =====");

                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println((i + 1) + " - " + produtos.get(i));
                        }

                        System.out.print("Digite o número do produto para remover: ");
                        int indice = entrada.nextInt();

                        if (indice >= 1 && indice <= produtos.size()) {
                            produtos.remove(indice - 1);
                            System.out.println("Produto removido com sucesso.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println();

        } while (opcao != 0);

        entrada.close();

	}

}
