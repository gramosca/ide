package poo;

public class Uno {

	public static void main(String[] args) {
		Carro uno = new Carro(1991, "branco");
		System.out.println("carro: uno");
		System.out.println("ano: " + uno.ano);
		System.out.println("cor: " + uno.cor);
		uno.ligar();
		uno.acelerar();
	}
}

// principal vantagem de construir um objeto desta forma é que economiza linha de
// cod, defino as variaveis dentro do () na hora que criar o abjeto, linha 6;
// importante:: temos que definir qual construtor vai ser usado na criação do
// objeto, ex: para aparecer o numero do chassi teria que gerar o cod do chassi
// dentro do construtos this.
