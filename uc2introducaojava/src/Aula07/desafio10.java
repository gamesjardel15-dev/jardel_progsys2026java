package Aula07;

import java.util.ArrayList;
import java.util.Scanner;

public class desafio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Pesquisar contato");
            System.out.println("4 - Editar telefone");
            System.out.println("5 - Remover contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            entrada.nextLine();

            switch (opcao) {
                case 1:
                	System.out.println("Opção 1 Cadastrar contato");
                    break;

                case 2:
                	System.out.println("Opção 2 Listar contatos");
                    break;
                    
                case 3:
                	System.out.println("Opção 3 Pesquisar contato");
                	break;
                	
                case 4:
                	System.out.println("Opção 4  Editar telefone");
                	break;
                	
                case 5:
                	System.out.println("Opção 5  Remover contato");
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
