package Aula08;

public class produto1 {
	 String nome;
	    double preco;
	    int estoque;

	    void exibirDados() {
	        System.out.println("Produto: " + nome);
	        System.out.printf("Preço: R$ %.2f%n", preco);
	        System.out.println("Estoque: " + estoque);
	    }

	    double calcularValorTotalEstoque() {
	        return preco * estoque;
	    }

	    void adicionarEstoque(int quantidade) {
	        if (quantidade > 0) {
	            estoque = estoque + quantidade;
	            System.out.println("Estoque adicionado com sucesso.");
	        } else {
	            System.out.println("Quantidade inválida para adicionar.");
	        }
	    }

	    void removerEstoque(int quantidade) {
	        if (quantidade > 0 && quantidade <= estoque) {
	            estoque = estoque - quantidade;
	            System.out.println("Estoque removido com sucesso.");
	        } else {
	            System.out.println("Quantidade inválida para remover.");
	        }
	    }
}
		 
		 
		 
		 
		 
	
	 
