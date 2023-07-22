package exercicios;

import java.util.Scanner;

public class CarroFlex {
	/*
	 * A principal diferença de preço e vantagens entre 2 combustiveis está na
	 * proporção preço x desempenho. Para o alcool ser mais vantajoso que a gasolina, o preço do litro
	 * tem que custar até 70% do litro da gasolina. Baseado nessas informações
	 * desenvolva um app para determinar qual é o combustivel mais vantajoso.
	 */

	public static void main(String[] args) {
		// variáveis
		double alcool, gasolina;
		
		// objetos
		Scanner teclado = new Scanner(System.in);
				
		// entrada
		System.out.println("GASOLINA X ALCOOL ");
		System.out.println("qual o valor do litro da gasolina");
		gasolina = teclado.nextDouble();
		System.out.println("qual o valor do litro da alcool");
		alcool = teclado.nextDouble();
		
		//processamanto/Saída
		
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abastecer com Álcool");
		} else {
			System.out.println("Abastecer com Gasolina");

		}
		teclado.close();
	}

}
