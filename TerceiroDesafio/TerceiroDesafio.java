package TerceiroDesafio;

import java.util.Scanner;

public class TerceiroDesafio {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		int k, n ; //Valor alvo e tamanho do array
		int numPares = 0; 
		
		System.out.println("Valor alvo K: ");
		k = dados.nextInt();
		
		System.out.println("Tamanho do array N: ");
		n = dados.nextInt();
		
		int[] arr = new int[n]; //Cria um array com o n�mero de posi��es desejadas
		
		//Nesse loop o usu�rio adiciona os valores do array
		for (int x = 0; x < arr.length ; x++) {
			System.out.println("Informe o valor "+ (x+1) +" para adicionar no array: ");
			int numero = dados.nextInt();
			arr[x] = numero;//Como cada posi��o j� est� definida no array, � poss�vel atribuir um valor nela;
		}
		
		//System.out.println("");
		//System.out.println("C�LCULOS:");
		
		for (int numeroArray : arr) { //Primeiro loop para pegar cada valor do array;
			for (int numeroCalculo : arr) { //Segundo loop para calcular o valor pego acima com todo restante;
				//System.out.println(numeroArray +" - "+ numeroCalculo);
				if (numeroArray - numeroCalculo == k) { //Se o c�lculo satisfazer o alvo, � adicionado +1 a vari�vel numPares;
					numPares ++;
					//System.out.println("Alvo ok - "+ numeroArray +" - "+ numeroCalculo);
				}
			}
		}
		
		System.out.println(numPares);
	
		
	}
	
}
