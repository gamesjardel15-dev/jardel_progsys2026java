package Aula05;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DataeHora7 {

public static void main(String[] args) {
	LocalDate dataAtual = LocalDate.now();

    DateTimeFormatter formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    String dataFormatada = dataAtual.format(formatoBrasil);

    System.out.println("Data padrão: " + dataAtual);
    System.out.println("Data formatada: " + dataFormatada);

	}

}
