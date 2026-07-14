package Aula09.desafio1;

public class ContaBancaria {
	private String nome,curso;
	private double saldo ;

	public ContaBancaria() {
	}

	public ContaBancaria(String nome, double preco) {
	    this.nome = nome;
	    this.saldo = saldo ;
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
	    return saldo;
	}

	public void setPreco(double preco) {
	    if (preco >= 0) {
	        this. saldo= saldo;
	    }
	}
}
