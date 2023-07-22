package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversãoTemperatura {

	public static void main(String[] args) {
		// variáveis
		double c, f;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat ("#0.0");
		//entada de dados
		System.out.println("Conversão de temperatura");
		System.out.print("digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		//processamento
		c = (5 * (f - 32)) / 9;
		//saida
		System.out.println("Temperatura em Celsius: " + formatador.format(c) + "°c");
		teclado.close();
	}
}

/*
 * para capturar aquilo que é digitado no teclado temos que usar um objeto
 * criado apartir de uma classe modelo de nome scanner. essa classe scanner
 * permite a entrada de dados via taclado quando usamos o console.
 * essa classe Scanner faz parte do kit do desenvolvedor java.
 * in = imput
 * para importar automaticamente usamos as teclas Ctrl + Shift + o.
 * #0.0 = para formatação do resultado apenas com 1 casa decimal.
 * Alt + 248 = °
 */