package Aula09.desafio1;

public class Aluno {
	private String nome,curso;
	private double nota1, nota2 ;

	public  Aluno() {
	}

	public Aluno(String nome, double preco) {
	    this.nome = nome;
	    this.nota1 = nota1;
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
	    return nota2;
	}

	public void setPreco(double preco) {
	    if (preco >= 0) {
	        this.nota2 = nota2;
	    }
	}
}
