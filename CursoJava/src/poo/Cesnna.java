package poo;

public class Cesnna {

	public static void main(String[] args) {
		Aviao cesnna = new Aviao();
		cesnna.ano = 2015;
		cesnna.cor = "branco";
		cesnna.envergadura = 11;
		System.out.println("aviao: Cesnna");
		System.out.println("Ano " + cesnna.ano);
		System.out.println("Cor " + cesnna.cor);
		System.out.println("Envergadura " + cesnna.envergadura + " m " );
		cesnna.acelerar();
		cesnna.aterrizar();
		cesnna.desligar();
	}

}
/* herança é a reutilização de variaveis e métodos sas classes modelos. */
