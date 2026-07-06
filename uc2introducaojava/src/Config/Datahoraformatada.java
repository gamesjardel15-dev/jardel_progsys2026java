package Config;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datahoraformatada {
	
public String dataFormatada() {
		
LocalDate data = LocalDate.now();
DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String databr = data.format(dataformatada);
		
    return "Data: " +databr;
}

public String horaFormatada() {
	
	LocalTime hora = LocalTime.now();
	DateTimeFormatter horaformatada = DateTimeFormatter.ofPattern("HH:mm:ss");
	String horabr = hora.format(horaformatada);
			
	return "Hora: " +horabr;
 
   }

public String datahoraFormatada() {
	
LocalDateTime datahora = LocalDateTime.now();
DateTimeFormatter datahoraformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String datahorabr = datahora.format(datahoraformatada);

return "Data hora: " + datahoraformatada;
 }

}
