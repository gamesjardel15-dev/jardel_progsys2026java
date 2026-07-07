package Aula06;
import java.util.Scanner;
public class WhileScannerTópico01 {

	public static void main(String[] args) {
		int condicao = 1; String conteudo;
		Scanner input = new Scanner(System.in);
 while(condicao==1) {
	 
	 System.out.println("DIGITE ALGUMA COISA: ");
	 conteudo = input.nextLine();
	 
 if(conteudo.equals("sair")){ 
	condicao = 0;
  }
 
 
        }
 
	}

}
