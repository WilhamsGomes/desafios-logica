package PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		//Criando ArrayList para receber a entrada de números, números pares e ímpares;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
		
		//Recebendo o número de linhas
		System.out.println("Informe o valor N: ");
		int N = dados.nextInt();
		
		while (N < 1 || N >= (Math.pow(10, 5)) ) {
			System.out.println("Valor inválido. Tente novamente");
			N = dados.nextInt();
		}
		
		//Recebendo o valor de cada linha
		for (int x = 1; x <= N; x++) {
			System.out.println("Informe um número:");
			int numeroInformado = dados.nextInt();
			numeros.add(numeroInformado);
		}
		
		//Separando os números pares e ímpares, por meio do operador %, o qual retorna o restante da divisão de um cálculo
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				numerosPares.add(numero);
			} else if (numero % 2 == 1) {
				numerosImpares.add(numero);
			}
		}
		
		//Método sort tem a função de ordenar
		//Utilizando Collections, pois os números estão em um ArrayList
		Collections.sort(numerosPares);
		
		//Aqui o método reverseOrder faz o efeito contrário
		//Método sort ordena em ordem crescente e o reverseOrder faz o efeito reverso
		Collections.sort(numerosImpares, Collections.reverseOrder());
		
		for (int numero : numerosPares) {
			System.out.println(numero);
		}
		
		for (int numero : numerosImpares) {
			System.out.println(numero);
		}
		
		
	}
	
}
