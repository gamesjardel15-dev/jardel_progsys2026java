package Aula09.desafio1;

public class Produtoview {

	public static void main(String[] args) {
		
		        Produto produto = new Produto("Mouse", 50.00);

		        System.out.println("Produto: " + produto.getNome());
		        System.out.println("Preço: R$ " + produto.getPreco());
	}

}
