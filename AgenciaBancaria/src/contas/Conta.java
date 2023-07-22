
// ------------- MODIFICADIRES DE ACESSO -----------------

/*  são usados para limitar o acesso ao atributos e métodos da classe modelo.
em programação orientada ao objetos usamos para deixar mais o sistema mais
 seguro./* 
 
/* o modificador (PUBLIC) permite que qualquer classe de qualquer pacote acesse
sem nenhuma restrição os atributos e metodos da classe modelo.*/

// (PRIVATE) este modificador limita os acessos à própria classe.

/* (PROTECTED) permite o acesso de uma classe de um outro pacote no caso de uma
herença.*/

/* e por padrão quando agente não expecifica nenhum tipo de modificador as
 classes que pertencem ao mesmo pacote podem acessar os atributos e métodos da
 classe modelo. */

package contas;

public class Conta {
	// atributos
	private String clientes;
	public String getCliente() {
		return clientes;
	}
	public void setClientes(String clientes) {
		this.clientes = clientes;
	}
	private double saldo;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// contrutor
	public Conta() {
		System.out.println("Agência 0261 ");
	}

	// método sem parametros
	public void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}

	// método com parametros
	/*
	 * no java podemos fazer a passagem desses parametros definindo dentro de
	 * parenteses um novo atributo.
	 */
	void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$ " + valor);
	}

	// método com parametros
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: R$ " + valor);
	}

	// método com objetos
	/*
	 * além de variáveis é possivel trabalhar objetos como parametros, para
	 * criar um objeto dentro dos parenteses usamos a classe modelo e define o
	 * nome oara o novo objeto. quando usar esse método temos que definir um
	 * objeto e também um valor. a palavra this se refere a ele mesmo.
	 */
	void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$ " + valor);
	}

	// método com retorno, não usa a palavra void.
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}

}

// --------------------- MÉTODOS -----------------------

/*
 * no java métodos são equivalentes as funções de outras linguagem de
 * programação e precisam sempre ser dfinidos dentro de uma classe.
 */

/*
 * (main) é o método principal, quando executar o cód java a jvn vai procurar
 * por este método.
 */

// (static) ele pode ser evocado somente por outros métodos static.

/*
 * (void) é usado para identificar um método sem retorno, ou seja um método ao
 * ser evocado executará uma ação.
 */

// métodos sem retorno podem também ter parametros como variaveis ou objetos.

// ----------------------- ENCAPSULAMENTO ---------------------------
/*
 * O principal objetivo é refinar a segurança do sistema, limita o acesso as
 * variaveis impedindo que valores inapropriados sejam atribuidos. a idéia
 * pricipal é atribuir um modificador do tipo private a variavel que vc pretende
 * proteger e criar 2 métodos publicos para que outras classes possom ter
 * acessos a esta variavel. 
 * GET obtém o conteudo da variavel. 
 * SET atribui um novo valor a variavel.
 * este método vai setar a variavel cliente com o valor atribuido pela
 * classe pessoaFisica e pela classe seguroPessoaFisica. como estou
 * usando como parametros uma variavel do tipo String essa variavel da
 * classe modelo sempre vai receber este tipo de valor. além de limitar
 * o acesso as variaveis o encapsulamento faz com o que o valor correto
 * seja atribuidos. E criamos esses 2 métodos para a variavel saldo.
 */
