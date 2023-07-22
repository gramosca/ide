package array;

import java.util.ArrayList;

public class Array3List {
	// Array list = vetores dinâmicos;
	// precisa ficar claro que o array list não é matriz;

	/*
	 * o array list é um vetor simples com a diferença que o seu tamanho pode
	 * variar de forma dinâmica de acordo com o tempo;
	 */

	/*
	 * o array list é muito usado em sistemas que coletam informações de um
	 * banco de dados, neste caso os dados são coletados do banco e armazenados
	 * temporariamente no array list para posteriormente serem manipulados;
	 */

	// para criar um array list no java devemos importar esse recurso;
	public static void main(String[] args) {
		// sintaxe
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("mosca");		
		contatos.add("José de Assis");
		contatos.add("99999 - 9999");
		contatos.add("ze@email.com");
		contatos.add("Grazi ");
		contatos.add("965885 - 6695");
		contatos.add("grm@emai.com");
		System.out.println("tamanho do array: " + contatos.size()); // para saber 0 tamanho total do array.
		System.out.println(contatos);
		System.out.println("Telefone José de Assis (índice[2]) " + contatos.get(2)); // get (o indice que vc quer) para saber 1 contato
		System.out.println("____________________________");
		for (int i=0; i < contatos.size(); i++){ // para obter todos os valores.
			System.out.println(contatos.get(i));
		}

	}

}
