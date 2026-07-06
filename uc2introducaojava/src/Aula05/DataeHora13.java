package Aula05;
import java.time.LocalDate;
public class DataeHora13 {

public static void main(String[] args) {
	 LocalDate hoje = LocalDate.now();
     LocalDate vencimento = hoje.plusDays(5);

     if (vencimento.isAfter(hoje)) {
         System.out.println("A data de vencimento ainda vai chegar.");
     }

     if (hoje.isBefore(vencimento)) {
         System.out.println("Hoje é antes do vencimento.");
     }

     if (hoje.isEqual(LocalDate.now())) {
         System.out.println("A data é igual à data atual.");
      }
     
   }

}
