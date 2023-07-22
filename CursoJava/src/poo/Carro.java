package poo;

import java.util.Random;

public class Carro {

	// atributos, variáveis.
	int ano;
	String cor;

	public Carro() {
		// para criar numeros aleatórios usamos a classe random;
		// na linguagem java vc importa os recursos sempre que precisar.
		// construtor sem parametros, abaixo...
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("chassi: " + chassi);
	}

	/* construtor com parametros é necessário que esse construtor receba as
	variaveis com (this) se refere ao construtor. */
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
	}
	
	// métodos

	void ligar() {
		System.out.println("engine on............");
	}

	void desligar() {
		System.out.println("engine off...........");
	}

	void acelerar() {
		System.out.println("vrummmmmmmmmmmmmmmmmm");
	}

}

/*  O java e a maioria dos programas de programação são orientada ao abjetos;
 o principal objetivo é representar cadas elemento do mundo real para um
 objeto
 dentro do seu sistema;*/

/*  para um computador entender o que é um objeto, temos que descrever as
 caracterisricas e também as ações que podem ser executadas por esse objeto;/* 

/*  a principal vantagem de desenvolver sistemas usando programação orientada ao
 objeto é que os sistemas fica muito mais proximo do que vemos na mundo real;*/

// ------------- outras vantagens: -------------
// é a organização e leitura do código;
// a manutenção do sistema;
// a reutilização do código e a otimização dos recursos.

// os os 4 pilares do programação orientada ao objeto(poo) são:
// --------- abstração ------------
// --------- herança --------------
// --------- polimorfismo ---------
// --------- encapsulamento -------

// --------------- ABSTRAÇÃO ------------

/* abstração é usado para definir uma classe modelo na criação dos abjetos, esse
modelo (Carro.java). */
/* além de atributos e métodos podemos também definir construtores na classe
modelo.*/
// a palavra new para criar um novo objeto
// nome de classe sempre letra maiuscula;

// ------------------ CONSTRUTORES ----------------

// construtor: não usa a palavra class.
// bolinha cheia pintada de verde ao lado direito da tela(estrutura) =
// construtor.

// para impopotar, tendo um modelo da classe Random, eu vou criar um objetor
// de gerador.

// para importar um recurso automáticamente combinação das teclas Ctrl +
// shift + o;
// ou na lampada ao lado esquerdo nos numeros.

// explicando a linha 20, vou gerar numeroa aleatórios entre 0 e 1000 e o
// resultado vai ser atribuido a variável chassi.

// para criar construtores, precisamos usar o mesmo nome da classe.
// construtores são blocos de comandos usados para inicializar os abjetos.
// no java é possivel criar vários construtores dentro da classe modelo.
// cada construtor obrigatóriamente deve ter o mesmo nome da classe.
/* o que muda de um construtor para o outro é a passagem dos parametros e dos
atributos. */
// criar construtos depois das variáveis.

// ------------------ MÉTODO -------------------------

/* para criar um método usamos a palavra void. ex: void - ligar ou void -
desligar. */

/* ao lado direito da tela em Estrutura(outline)vemos os atributos(triangulo
vazio) e os métodos(triangulo cheio). */

// ----------------- HERANÇA -------------------------

/* criamos uma sub classe da classe modelo estendendo seus atributos e metodos;
 ou seja, é possivel criar outros tipos de objetos reutilizando atributos e
 metodos da classe modelo.*/

/* a subclasse também é uma classe modelo permitindo a criação de outros
 atributos e metodos. */

// extends é a palavra usada para criar a herança.

// ---------------- POLIMORFISMO ------------------------
// É modificação do comportamento de um método existente na classe modelo;
// podemos chamar isso de subscrita de um método.

// para sobescrever o método que é o conceito de polimorfismo, criamos um novo
// método dentro da classe avião e tem que ter o mesmo nome da classe carro.

// o método com triangulo azul cheio maior e 1 menor siguinifica que não é um
// método novo, é um método subescrito e vai ter um comportamento diferente em
// todos os objetos que forem criados a partir desta classe.

