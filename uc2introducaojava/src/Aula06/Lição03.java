package Aula06;

public class Lição03 {

	public static void main(String[] args) {
		int contador = 1;

        do {
        	contador++;
            System.out.println("MENU SISTEMA\n"
                      + "1-CADASTRAR PRODUTO\n"
                      + "2-Lista produto\n"
                      + "3- Consultar produto\n" 
                      + "0- Sair\n");
        } while (contador <= 5);
	}

}
