package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HoraServiço {
	/*
	 * Desenvolva uma aplicação para calcular o valor da hora de serviço, de
	 * acordo com a formula:
	 * 
	 * remuneração mensal + imposto + custo operacional + investimentos hora =
	 * --------------------------------------------------------------------
	 * carga horária mensal de trabalho impostos: 30% da remuneração mensal
	 * investimentos: 20% da remuneração mensal
	 */

	public static void main(String[] args) {
		// variáveis
		double hora, remuneracao, custo, cargaHoraria;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		// entrada
		System.out.println("Calculo do valor da hora de um serviço");
		System.out.println("qual a remuneração mensal pretendida? ");
		remuneracao = teclado.nextDouble();
		System.out.println("custo operacional? ");
		custo = teclado.nextDouble();
		System.out.println("qual a carga horária mensal de trabalho? ");
		cargaHoraria = teclado.nextDouble();

		// processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		System.out.println("valor da hora: " + formatador.format(hora));
		teclado.close();
	}

}
