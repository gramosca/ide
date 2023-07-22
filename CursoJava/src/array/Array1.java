package array;
/* 
* o ARRAY Otimiza otimiza o uso da memória e simpifica o desenvolvimento;
* é uma estrutura de dados indexada que permite armazenar multiplos valores;
* uma forma especial de trabalhar com as variáveis ou seja, em uma variável 
* normal podemos aramzenar apenas 1 único valor, já no ARRAY podemos armazenar
* em uma unica variável multiplos valores;
* Precisa ficar claro que não se trata de banco de dados, o ARRAY é um tipo de
* especial de variável que trabalham com memórias e o banco da dedos trabalham 
* com armazenamento em disco, o ARRAY armazena os dados como se fosse uma lista,
* e cada item da lista tem um identificador chamado de índice que é um número inteiro e sempre
* começa em zero(0), o tamanho do ARRAY é determinado pelo número de itens na lista;
*/

// na linguagem java temos 3 tipos de ARRAY
// ARRAY SIMPLES - Vetor(estático) onde o tamanho é sempre fixo;
// ARRAY LIST - Vetor(dinâmico) onde o tamanho pode ser alterado de forma dinâmica;
// ARRAY MULTIDIMENCIONAL - (Matriz) que é um ARRAY de ARRAY;

/* Na linguagem java para criar um ARRAY simples, 
 * determinamos o tipo de variável usando colchetes[] e definimos um nome pra o ARRAY;
 * o conteudo do ARRAY será armazenado dentro de chaves{} e neste caso o tamanho do ARRAY 
 * é definido pela quantidade de itens armazenados;
 */
public class Array1 {

	public static void main(String[] args) {
		String[] carros = {"ferrari", "fusca", "camaro", "uno"};
		// ídece do array     [0]       [1]      [2]      [3]      
		System.out.println("Tamanho do array " + carros.length); // carros.length = vai retornar o numero total de array.
		System.out.println("Carro: " + carros[2]); // para recuperar um carro.
		carros[2] = "porsche"; // para modificar o conteudo de um array
		System.out.println("Carro: " + carros[2]); // pedindo para imprimir novamente.
		// para recuperar todos os valores de um array usamos um laço do tipo for;
		System.out.println("____________________________________");
		System.out.println("_____________ carros _______________");
		System.out.println("____________________________________");
		System.out.println("");
		for (int i = 0; i < carros.length; i++) {
			System.out.println(carros[i]);
		}	
	}

}
