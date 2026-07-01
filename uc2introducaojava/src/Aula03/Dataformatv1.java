package Aula03;
import java.util.Scanner;
public class Dataformatv1 {

	public static void main(String[] args) {
    double preco = 49.9;

	String mensagem = String.format("Preço formatado: R$ %.2f", preco);

	System.out.println(mensagem);	

	}

}
