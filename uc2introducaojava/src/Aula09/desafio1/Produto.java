package Aula09.desafio1;

public class Produto {
	private String nome;
	private double preco;

	public Produto() {
	}

	public Produto(String nome, double preco) {
	    this.nome = nome;
	    this.preco = preco;
	}

	public String getNome() {
	    return nome;
	}

	public void setNome(String nome) {
	    if (nome != null && !nome.isBlank()) {
	        this.nome = nome;
	    }
	}

	public double getPreco() {
	    return preco;
	}

	public void setPreco(double preco) {
	    if (preco >= 0) {
	        this.preco = preco;
	    }
	}
}
