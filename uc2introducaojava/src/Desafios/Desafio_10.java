package Desafios;
import java.util.Scanner;
public class Desafio_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        String nomeSistema;
        String versao;
        String desenvolvedor;
        int anoCriacao;
        boolean sistemaAtivo;

        System.out.print("Digite o nome do sistema: ");
        nomeSistema = entrada.nextLine();

        System.out.print("Digite a versão do sistema: ");
        versao = entrada.nextLine();

  

        System.out.println("===== FICHA DO SISTEMA =====");
        System.out.println("Sistema: " + nomeSistema);
        System.out.println("Versão: " + versao);

      

        entrada.close();

	}

}
