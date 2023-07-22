package exercicios;

import java.util.Scanner;

public class PedraPapelTesoura {
	/*
	 * Desenvolva o jogo Pedra Papel e Tesoura seguindo o modelo:
	 * __________________JOKENPO________________________
	 */
	// 1. PEDRA
	// 2. PAPEL
	// 3. TESOURA
	/*
	 * Digite a opção desejada: Jogador escolheu (exibe a opção que o jogador
	 * escolheu);
	 */
	// Computador escolheu: (computador sorteia uma opção);
	/*
	 * Vencedor: (compara as opções escolhidas e exibe o vencedor ou declara
	 * empate);
	 */
	public static void main(String[] args) {
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);

		System.out.println("__Jokempo__ ");
		System.out.println("____________");
		System.out.println("");
		System.out.println("1. - Pedra");
		System.out.println("2. - Papel");
		System.out.println("3. -Tesoura");
		System.out.println("Digite uma opção:");

		// LÓGICA DO JOGADOR
		jogador = teclado.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu papel");
			break;
		case 3:
			System.out.println("Jogador escolheu tesoura");
			break;
		default:
			System.out.println("opção inválida");
			break;
		}
		teclado.close();

		// LÓGICA COMPUTADOR
		/*
		 * A função (Math.random) gera numero aleatório escolhendo entre as
		 * opções 1, 2 ou 3; A variável computador = (int), essa função gera
		 * numeros aleatórios não inteiros e para converter esses numeros não
		 * inteiros para numeros inteiros colocamos (int) entre parenteses;
		 */
		
		computador = (int) (Math.random() * 3 + 1);
		
		/*
		 * obs: esses numeros são aorteados a partir do 0, então ele pode
		 * sortear o nº 0,1,2, então add + 1 para somar;
		 */

		switch (computador) {
		case 1:
			System.out.println("computador escolheu pedra");
			break;
		case 2:
			System.out.println("computador escolheu papel");
			break;
		case 3:
			System.out.println("computador escolheu tesoura");
			break;
		}
		// lógica para determinar o vencedor;
		// == compara valores
		// && e

		System.out.println("");
		if (jogador == computador) {
			System.out.println("Empate");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("Jogador ganhou");
			} else {
				System.out.println("Computador venceu");
			}
		}
	}
}
