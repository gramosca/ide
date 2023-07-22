package seguros;

import contas.Conta;

public class SeguroPessoaFisica {

	public static void main(String[] args) {
		Conta cc3 = new Conta();
		cc3.setClientes("Rita lee");
		cc3.setSaldo(150.000); 
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
		
		System.out.println("");
		System.out.println("------------------------------");
		
		Conta cc4 = new Conta();
		cc4.setClientes("Led Zeppelin");
		cc4.setSaldo(5500.000);
		System.out.println("Cliente: " + cc4.getCliente());
		cc4.exibirSaldo();
		
	}
}
/* os pacotes no java são estruturas de pastas para vc organizar o conteudo do
seu projeto. */

// os pacotes também são usados para reforçar a segurança do sistema.

/* os erros que foram gerados é por a variavel não estar visivel, pois está
segura, temos que colocar public lá no classe modelo (conta). */

/* */
