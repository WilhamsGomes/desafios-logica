package UQuartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		int N;
		
		//Recebendo valor de N;
		//Na prática, esse o número de frases que serão recebidas
		System.out.println("Informe o valor N: ");
		N = Integer.parseInt(dados.nextLine());
		
		String[] frases = new String[N];
		String fraseDigitada = "";
		
		//Nesse loop as frases são recebidas;
		//A quantidade equivale ao valor N, como informado anteriormente 
		for (int x = 0; x < frases.length; x++) {
			
			//Aqui há esse "(x+1)" pq o loop inicia-se em 0, adicionamos mais um para ficar mais intuitivo ao usuário
			System.out.println("Informe"+ (x+1) +"ª frase: ");
			fraseDigitada = dados.nextLine();
			 
			//Verifica se a frase digitada tem mais de 2 caracteres e menos de 100. Caso não, é necessário informar novamente;
			while(fraseDigitada.length() < 2 || fraseDigitada.length() > 100) {
				System.out.println("Frase inválida, é necessário ter entre 2 a 100 caracteres. Tente novamente!");
				fraseDigitada = dados.nextLine();
			}
			
			//Se tudo estiver correto, a frase digitada é atribuida ao array;
			frases[x] = fraseDigitada;
		}
		
		for (String frase : frases) {

			//Aqui acontece a divisão da frase por meio do método substring;
			String primeiraParte = frase.substring(0, (frase.length()/2));
			String segundaParte = frase.substring( (frase.length()/2) , frase.length());
			
			//Aqui instanciamos a classe StringBuilder para usar o método reverse
			//Como o nome já diz, a função do reverse é "reverter" a sequência da String
			String reversePrimeiraParte = new StringBuilder(primeiraParte).reverse().toString();
			String reverseSegundaParte = new StringBuilder(segundaParte).reverse().toString();
			
			//Por fim, unimos a primeira e segunda parte, e imprimimos o resultado final!
			System.out.println( reversePrimeiraParte + reverseSegundaParte);
			
		}
		
	}
	
}
