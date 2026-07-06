package Aula05;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DataeHora12 {

public static void main(String[] args) {
	LocalDate dataAtual = LocalDate.now();

    LocalDate dataVencimento = dataAtual.plusDays(30);
    LocalDate dataAnterior = dataAtual.minusDays(7);

    DateTimeFormatter formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Data atual: " + dataAtual.format(formatoBrasil));
    System.out.println("Vencimento em 30 dias: " + dataVencimento.format(formatoBrasil));
    System.out.println("Data de 7 dias atrás: " + dataAnterior.format(formatoBrasil));
		
	}

}
