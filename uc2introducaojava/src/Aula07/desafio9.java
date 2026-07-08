package Aula07;

import java.util.ArrayList;
import java.util.Scanner;

public class desafio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Editar tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("5 - Limpar todas as tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            entrada.nextLine();

            switch (opcao) {
                case 1:
                	System.out.println("Opção 1 Adicionar tarefa");
                    break;

                case 2:
                	System.out.println("Opção 2 Listar tarefas");
                    break;
                    
                case 3:
                	System.out.println("Opção 3 Editar tarefa");
                	break;
                	
                case 4:
                	System.out.println("Opção 4 Remover tarefa");
                	break;
                	
                case 5:
                	System.out.println("Opção 5 Limpar todas as tarefas");
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
