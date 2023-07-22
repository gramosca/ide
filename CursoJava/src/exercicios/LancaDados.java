package exercicios;

import java.util.Scanner;

public class LancaDados {
	/*
	 * Desenvolva um app que lance um dado de 6 faces. O app deverá sortear
	 * usando a função Math.random(gera numeros aleatórios), exibindo a face
	 * sorteada. Após a exibição deverá perguntar se pretende continuar, caso
	 * sim deverá ter um novo sorteio.
	 */

	public static void main(String[] args) {
		// objeto
		Scanner teclado = new Scanner(System.in);
		
		// variável
		char opcao = 's';
			
		// processamento
	 while (opcao == 's'){
		System.out.println("Lancamncamento de Dados");
		int dado = (int)(Math.random() * 6 + 1);
		System.out.println("face: " + dado);
		System.out.println("Deseja lançar o dado novamente (s/n)? ");
		opcao = teclado.next().charAt(0);
		// charArt(0) = para capturar a 1º letra digitada e ignorar os demais.
	 	}
	}
}
