package Aula06;

public class Tópico08 {

	public static void main(String[] args) {
		 double[] notas = {8.5, 7.0, 9.0};
	        double soma = 0;
	        double media;

	        for (int i = 0; i < notas.length; i++) {
	            soma = soma + notas[i];
	        }

	        media = soma / notas.length;

	        System.out.printf("Média do aluno: %.2f%n", media);
	}

}
