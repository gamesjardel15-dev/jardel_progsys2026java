package Aula09.desafio1;

public class Cliente {
	private String nome,email;
    private double telefone;

    public Cliente() {
    }

    public Cliente(String nome, double telefone) {
        this.nome = nome;
        this.telefone = telefone;
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
        return telefone;
    }

    public void setPreco(double telefone) {
        if (telefone >= 0) {
            this.telefone = telefone;
        }
    }
}
