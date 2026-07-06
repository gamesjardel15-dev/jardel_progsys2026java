package Aula05;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DataeHora8 {

public static void main(String[] args) {
	
	 LocalTime horaAtual = LocalTime.now();

     DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

     String horaFormatada = horaAtual.format(formatoHora);

     System.out.println("Hora formatada: " + horaFormatada);
     
	}

}
