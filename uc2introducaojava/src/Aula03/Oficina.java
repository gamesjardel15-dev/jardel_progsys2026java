package Aula03;
import java.text.DecimalFormat;
public class Oficina {

	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat("#,##0.00");
		double v1, v2, soma, subtracao, multiplicacao, divisao, resto;

		v1 = 100;
		v2 = 20;
		soma = v1 + v2;

		subtracao = v1 - v2;

		multiplicacao = v1 * v2;

		divisao = v1 / v2;

		resto = v1 % v2;

		System.out.println("Soma: de " + v1 + " + " + v2 + " = " + soma);
		System.out.println("Subtração: de " + v1 + " - " + v2 + " = " + subtracao);
		System.out.println("Multiplicação: de " + v1 + " * " + v2 + " = " + multiplicacao);
		System.out.println("Soma: de " + v1 + " / " + v2 + " = " + divisao);
		System.out.println("Resto: de " + v1 + " %  " + v2 + " = " + resto);

		System.out.println("MUDANÇA DE SAÍDA");

		System.out.printf("Total: R$ %.2f%n", soma);
		System.out.printf("Total: R$ %.2f%n", subtracao);
		System.out.printf("Total: R$ %.2f%n", multiplicacao);
		System.out.printf("Total: R$ %.2f%n", divisao);
		System.out.printf("Total: R$ %.2f%n", resto);
		
		System.out.println("Valor formatado: " + formato.format(soma));

	}

}
