package Aula09.desafio1;

public class Funcionario {
	 private String nome,cargo;
	    private double salario;

	    public Funcionario() {
	    }

	    public Funcionario(String nome, double preco) {
	        this.nome = nome;
	        this.salario = preco;
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
	        return salario;
	    }

	    public void setPreco(double preco) {
	        if (preco >= 0) {
	            this.salario = salario;
	        }
	    }
}
