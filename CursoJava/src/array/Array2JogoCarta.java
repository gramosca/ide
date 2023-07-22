package array;
/* FAZER UM OU MAIS ARRAY COM AS 52 CARTAS DO BARALHO E RECUPERAR 
 * UMA ESPECÍFICA;
*/

public class Array2JogoCarta {

	public static void main(String[] args) {
		String[] nipes = {"ouro", "copas", "espada", "paus"};
		String[] faces = {"Az","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
		
		// As linhas a baixo recuperam de forma aleatória o conteudo dos Array;
		String nipe = nipes[(int) (Math.random()*4)];
		String face = faces[(int) (Math.random()* faces.length)];
		
		// a linha a baixo exibe a carta sorteada;
		System.out.println(face + " de " + nipe);
	}
}
