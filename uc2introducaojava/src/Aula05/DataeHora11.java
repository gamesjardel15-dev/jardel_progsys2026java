package Aula05;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DataeHora11 {

public static void main(String[] args) {
	   Scanner entrada = new Scanner(System.in);

       DateTimeFormatter formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       System.out.print("Digite sua data de nascimento no formato dd/MM/yyyy: ");
       String dataTexto = entrada.nextLine();

       LocalDate dataNascimento = LocalDate.parse(dataTexto, formatoBrasil);
       LocalDate dataAtual = LocalDate.now();

       Period periodo = Period.between(dataNascimento, dataAtual);

       System.out.println("Idade: " + periodo.getYears() + " anos");

       entrada.close();

	}

}
