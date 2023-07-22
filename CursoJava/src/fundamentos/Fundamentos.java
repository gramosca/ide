/**
 * 
 */
package fundamentos;

/**
 * @author gramo
 *
 */
public class Fundamentos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nome = "Iron não ";
		int idade = 35; 
		char sexo = 'f';
		double temperatura = 26.7;
		boolean arCondicionado = false;
		System.out.println("uso de váriaveis na linguagem Java");
		System.out.println("");
		System.out.println("             exemplos             ");
		System.out.println("");
		System.out.println("nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("sexo: " + sexo);	
		System.out.println("temperatura: " + temperatura);
		System.out.println("ar condicionado: " + arCondicionado);
		System.out.println("----------------------------------");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores Aritméticos e Atribuições");
		System.out.println("             Exemplos               ");
		System.out.println("i = " + i);	
		System.out.println("i = " + i + " + 5 | i = " + (i+5));
		System.out.println("i = " + i + " - 5 | i = " + (i-5));
		System.out.println("i = " + i + " * 5 | i = " + (i*5));
		System.out.println("i = " + i + " / 5 | i = " + (i/5));
		System.out.println("i = " + i + " % 5 | i = " + (i%5));
		System.out.println("i = += 5     | i = " + (i += 5));
		System.out.println("i = -= 5     | i = " + (i -= 5));
		System.out.println("i = *= 5     | i = " + (i *= 5));
		i++;
		System.out.println("i++          | i = " + i);
		i--;
		System.out.println("i--          | i = " + i);
		System.out.println("----------------------------------");
		System.out.println("");
		System.out.println("      ESTRUTURA DE CONTROLE       ");
		System.out.println("");
		System.out.println("Estrutura de controle condicional ");
		
		System.out.println("");
		
		System.out.println("Exemplo 01 - uso do if ");
		if (sexo == 'M'){
			System.out.println("Alistamento militar obrigatório");			
		}
		System.out.println("");
		
		System.out.println("Exemplo 02 - uso do IF - ELSE");
		if (idade < 18){
			System.out.println("menor de idade");
		} else {
			System.out.println("maior de iadade");
		}
		
		System.out.println("");
		
		System.out.println("Exemplo 03 - uso do ELSE - IF ");
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");			
			} else if (idade >= 18 && idade <= 70 ){
				System.out.println("VOTO OBRIGATÓRIO");
			} else if (idade == 16 || idade == 17 || idade >70){
				System.out.println("VOTO FACULTARTIVO");
			}
		
		System.out.println("");
		
		System.out.println("Exemplo 04 - uso do switch case ");
		System.out.println("1. - cadastro de clientes");
		System.out.println("2. - cadastro de usuários");
		System.out.println("3. - relatório");
		
		//Scanner sc = new Scanner(System.in);
		int opcao = 3;
		
		//System.out.println("ESCOLHA UMA OPÇÃO");
		//opcao = sc.nextInt();
		switch (opcao){
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUÁRIOS");
			break;
		case 3:
			System.out.println("RELATÓRIO");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		}
		System.out.println("");
		System.out.println("Estrutura de repetições");
		
		System.out.println("");
		
		System.out.println("Exemplo 05 - uso do FOR ");
		for (int j = 10; j>0; j--){
			System.out.println("hello = " + j);
			}
		
		System.out.println("");
		
		
		System.out.println("Exemplo 06 - TABUADA ");
		for (int tabuada = 0; tabuada <= 10; tabuada ++){
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++){
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}					
		}
		
		System.out.println("");
		
		System.out.println("Exemplo 07 - uso da estrutura WHILE");
		int contador = 1;
		while (contador <=10){
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("");
		
		System.out.println("Exemplo 08 - uso da estrutura DO WHILE");
		char novoJogo;
		do{
			System.out.println("deseja jogar novamente (s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("GAME OVER");
	}
}
	
