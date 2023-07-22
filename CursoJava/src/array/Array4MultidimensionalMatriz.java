package array;

public class Array4MultidimensionalMatriz {
	/*
	 * Uma tabela é muldidimencional com 2 dimensões logo são 2 array 2
	 * dimensões;
	 */
	// [][] cria um array de 2 dimensões;

	public static void main(String[] args) {
		String[][] agenda = { {"josé","91234-1234","professorjoseassis@gmail.com"},{"Bill","2222-2222","bill@outlook.com"},
				{"linus","99999-9999","tux@linus.com" } };
		
		// recupera o telefone do josé
		System.out.println(agenda[0][1]);
		
		// para recuperar toda a tabela contruida usando a estrutura for.
		// logo a baixo percorrem os índices dos array.
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("--------------------------------");
			for (int j = 0; j < agenda.length; j++) {
				System.out.println(agenda[i][j]);
				
			}
			
		}
		
	}

}
