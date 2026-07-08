package Aula08;

public class Pessoaview {

	public static void main(String[] args) {

		Pessoa pessoa1= new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.nome ="Paula Lins";
		pessoa1.idade = 48;
		pessoa1.nacionalidade ="Brasileira";
		
		pessoa2.nome ="Joao Paulo";
		pessoa2.idade = 20;
		pessoa2.nacionalidade ="Brasileira";
		
		pessoa1.exibirPessoa();
		pessoa1.exibirPessoa();
	
		pessoa1.sexo ="Feminino";
		pessoa1.peso = 50.00;
		pessoa1. altura = 1.60 ;
		pessoa1. profissao = "Professora" ;
		
		pessoa2.sexo ="Masculino";
		pessoa2.peso = 60.00;
		pessoa2.altura= 1.70;
		pessoa2.profissao= "Diretor";
		
		
		
	    pessoa2.exibirPessoa();
	    pessoa2.exibirPessoa();
	}

}
