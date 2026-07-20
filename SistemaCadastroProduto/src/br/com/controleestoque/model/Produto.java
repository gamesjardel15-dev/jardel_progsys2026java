package br.com.controleestoque.model;

import java.text.NumberFormat;
import java.util.Locale;

public class Produto {
	 private String nome;
	    private double valor;
	    private int quantidade;

	    public Produto(String nome, double valor, int quantidade) {
	        this.nome = nome;
	        this.valor = valor;
	        this.quantidade = quantidade;
	    }

	    public double calcularTotal() {
	        return valor * quantidade;
	    }

	    public String getValorFormatado() {
	        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	        return formatoMoeda.format(valor);
	    }

	    public String getTotalFormatado() {
	        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	        return formatoMoeda.format(calcularTotal());
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public int getQuantidade() {
	        return quantidade;
	    }
}
