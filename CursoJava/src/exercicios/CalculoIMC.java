package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {
	/*
	 * Calcule p valor do IMC. Deverá exibir o valor IMC e a classificação de
	 * acordo com a tabela:
	 * abaixo de 15,5    -> abaixo do peso
	 * entre 18,6 e 24,9 -> peso ideal
	 * entre 25,0 e 29,9 -> levemente acima do peso
	 * entre 30,0 e 34,9 -> obesidade grau 1
	 * entre 35,0 e 39,9 -> obesidade grau 2 (severa)
	 * acima de 40       -> obesidade grau 3 (mórbida)
	 */

	public static void main(String[] args) {
		// variáveis
		double peso, altura, imc;
		
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		// entrada
		System.out.println("Calculo do IMC");
		System.out.println("Qual o seu peso? ");
		peso = teclado.nextDouble();
		System.out.println("Qual a sua altura? ");
		altura = teclado.nextDouble();
		
		// processamento
		imc = peso / (altura * altura);
		
		// saída
		System.out.println("IMC: " + formatador.format(imc));
		
		// classificação
		if (imc < 18.5){
			System.out.println("Abaixo do peso");
		} else if (imc < 25){
			System.out.println("Peso ideal");
		} else if (imc < 30){
			System.out.println("Levemente acima do peso");
		} else if (imc < 35){
			System.out.println("Obesidade grau 1 ");
		} else if (imc < 40){
			System.out.println("Obesidade grau 2 (severa)");	
		} else {
			System.out.println("obesidade grau 3 (móbida)");
		teclado.close();
		}

	}
}
