package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Regrade3 {
	/*
	 * Desenvolva uma aplicação no console para calcular o valor da parcentagem
	 * usando Regra de 3, conforme modelo: x% de y = valor = 10% de 200 = 20
	 */

	public static void main(String[] args) {
		// variáveis
		double x, y, valor;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// entrada
		System.out.println("Regra de 3");
		System.out.println("x% de y = valor ");
		System.out.println("digite o valor de x: ");
		x = teclado.nextDouble();
		System.out.println("digite o valor de y: ");
		y = teclado.nextDouble();
		// processamento
		valor = (x * y) / 100;
		// saída
		System.out.println(x + "% de " + y + " = " + formatador.format(valor));
		teclado.close();

	}
	// Shift + Alt + y = para fazer a quabra automática de linha.

}
