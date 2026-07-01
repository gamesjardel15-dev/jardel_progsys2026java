package Aula04;
import java.util.Scanner;
public class CondicionalifLogico {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    double media;
    
    media = 7;
    
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
