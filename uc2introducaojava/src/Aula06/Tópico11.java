package Aula06;
import java.util.ArrayList;
public class Tópico11 {

	public static void main(String[] args) {
		 ArrayList<String> produtos = new ArrayList<>();

	        produtos.add("Mouse");
	        produtos.add("Teclado");
	        produtos.add("Monitor");

	        for (String produto : produtos) {
	            System.out.println("Produto: " + produto);
	     }

	}

}
