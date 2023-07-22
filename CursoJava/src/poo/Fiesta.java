package poo;

public class Fiesta {

	public static void main(String[] args) {
		Carro fiesta = new Carro();
		fiesta.ano = 2008;
		fiesta.cor = "cinza";
		System.out.println("carro: fiesta");
		System.out.println("ano: " + fiesta.ano);
		System.out.println("cor: " + fiesta.cor);
		fiesta.ligar();
		fiesta.acelerar();
		fiesta.desligar();
	}
}

// construi um novo objeto tendo como modelo a classe carro sem parametros,
// portando ele cria o numero do chassi para esse carro;
// como já mencionado é possivel criar vários construtores esse aqui não tem parametros;
// vamos criar outro construtor. (ex: carro fiesta).lá em Carro.java.