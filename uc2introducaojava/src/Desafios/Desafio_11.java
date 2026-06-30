package Desafios;
import java.util.Scanner;
public class Desafio_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        String usuario;
        String senha;
        int codigoAcesso;

        System.out.print("Digite o usuário: ");
        usuario = entrada.nextLine();

        

        System.out.println("===== DADOS DE LOGIN =====");
        System.out.println("Usuário: " + usuario);

       

        entrada.close();
	}

}
