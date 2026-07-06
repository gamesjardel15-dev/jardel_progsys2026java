package Aula05;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataeHora14 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	String nome;
	String email;
	
	System.out.print("Digite o nome do cliente: ");
	nome = entrada.nextLine();
	
	System.out.print("Digite o e-mail do cliente: ");
	email = entrada.nextLine();
	
	LocalDateTime dataHoraCadastro = LocalDateTime.now();
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	System.out.println("===== CLIENTE CADASTRADO =====");
	System.out.println("Nome: " + nome);
	System.out.println("E-mail: " + email);
	System.out.println("Data e hora do cadastro: " + dataHoraCadastro.format(formato));
	
	entrada.close();
  }

}

	

	 
