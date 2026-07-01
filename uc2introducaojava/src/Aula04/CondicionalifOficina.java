package Aula04;
import java.util.Scanner;
public class CondicionalifOficina {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
    double media;
    
    media = 6.5;
    
    if (media >= 7) {
        System.out.println("APROVADO");
    } else if (media >= 4) {
        System.out.println("RECUPERAÇÃO");
    } else {
        System.out.println("REPROVADO");
    }
    
    input.close();
    
    }
}
