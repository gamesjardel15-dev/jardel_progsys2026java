package Desafios;
import java.util.Scanner;
public class Desafio_5 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        String nome;
	        String cargo;
	        double salario;

	        System.out.print("Digite o nome do funcionário: ");
	        nome = entrada.nextLine();

	        System.out.print("Digite o cargo: ");
	        cargo = entrada.nextLine();

	      

	        System.out.println("===== FUNCIONÁRIO CADASTRADO =====");
	        System.out.println("Nome: " + nome);
	        System.out.println("Cargo: " + cargo);



	        entrada.close();


	}

}
