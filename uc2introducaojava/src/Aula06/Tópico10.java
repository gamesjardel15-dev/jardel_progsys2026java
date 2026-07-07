package Aula06;
import java.util.ArrayList;
public class Tópico10 {

	public static void main(String[] args) {
		 ArrayList<String> nomes = new ArrayList<>();

	        nomes.add("Ana");
	        nomes.add("Carlos");
	        nomes.add("Mariana");

	        System.out.println("===== LISTA DE NOMES =====");

	        for (int i = 0; i < nomes.size(); i++) {
	            System.out.println((i + 1) + " - " + nomes.get(i));
	        }
	}

}
