package exercicios;

import java.util.Scanner;

public class Tabuada {
	/*
	 * Desenvolva um app para calcular o valor da tabuada, o app deverá
	 * perguntar por qual tabuada;
	 */

	public static void main(String[] args){	
		// Variável
		int valor;
		
		// objeto
		Scanner teclado = new Scanner(System.in);
		
		// entrada
		System.out.println("Digite o valor da tabuada:");
		valor = teclado.nextInt();
		
		// processamento: estrutura de repetição;
		// i = o  -> inicío 
		// i < 10 -> fim não inclui o 10;
		// i ++   -> inclemento, vale i = i + 1 exemplo;
		/* 
		 * i=i+1
		 * i=0+1=1
		 * i=1+1=2
		 * i=2+1=3 e assim vai.........
		 */
		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
		}		
	}
}