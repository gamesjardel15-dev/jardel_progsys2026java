package Aula05;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DataeHora9 {

	public static void main(String[] args) {
		LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String resultado = agora.format(formato);

        System.out.println("Data e hora formatada: " + resultado);
	}

}
