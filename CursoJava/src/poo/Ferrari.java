package poo;

public class Ferrari {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.ano = 2012;
		ferrari.cor = "vermelho";
		System.out.println("carro: ferrari");
		System.out.println("ano: " + ferrari.ano);
		System.out.println("cor: " + ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();
	}
}
// string sempre com "" (escrita);
// para essa clase temos o método principal pois será executado. Linha 5.
// inicia chamando a classe carro (ferrari), depois defino o nome do objeto,
// (ferrari = new Carro();),linha 6.
// linha 6 - criei um objeto de nome ferrari usando a classe carro como modelo.
// a classe ferrari está no mesmo pacote da classe carro.
// ai atribuimos valores as variaveis. ex: ferrari.cor = vermelho.
// concatenar é juntar os textos com +
//