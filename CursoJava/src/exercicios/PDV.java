package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {
	/* 
	 * Desenvolva uma aplicação de ponto de vendas(PDV), conforme modelo:
	 * Valor Total = 200,00
	 * Desconto (%): 5
	 * Total com Desconto: 190,00(valor Calculado)
	 * Valor Pago: 200,00
	 * Troco: 10,00 (valor Calculado)
	 */

	public static void main(String[] args) {
		// variáveis
		double total, desconto, totalDesconto, valorPago, troco;
		
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		// entrada 1
		System.out.println("PDV");
		System.out.println("Valor total ");
		total = teclado.nextDouble();
		System.out.println("Desconto (%)  ");
		desconto = teclado.nextDouble();
		
		// processamento 1
		totalDesconto = total - (desconto * total) / 100;
		
		// saída 1
		System.out.println("total com desconto: R$ " + formatador.format(totalDesconto));
		
		// entrada 2
		System.out.println("_______________________");
		System.out.println("Valor pago em dinheiro ");
		valorPago = teclado.nextDouble();
		
		// processamento 2 
		troco = valorPago - totalDesconto;
		System.out.println("Troco: R$ " + formatador.format(troco));
		teclado.close();
		
	}

}
