package Aula05;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DataeHora10 {

public static void main(String[] args) {
		
	 Scanner entrada = new Scanner(System.in);

     DateTimeFormatter formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

     System.out.print("Digite sua data de nascimento no formato dd/MM/yyyy: ");
     String dataTexto = entrada.nextLine();

     LocalDate dataNascimento = LocalDate.parse(dataTexto, formatoBrasil);

     System.out.println("Data digitada: " + dataNascimento.format(formatoBrasil));

     entrada.close();
	}

}
