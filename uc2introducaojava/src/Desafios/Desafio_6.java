package Desafios;
import java.util.Scanner;
public class Desafio_6 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        String titulo;
	        String autor;
	        int anoPublicacao;
	        double preco;
	        String categoria;

	        System.out.print("Digite o título do livro: ");
	        titulo = entrada.nextLine();

	    

	        System.out.println("===== LIVRO CADASTRADO =====");
	        System.out.println("Título: " + titulo);

	     

	        entrada.close();

	}

}
