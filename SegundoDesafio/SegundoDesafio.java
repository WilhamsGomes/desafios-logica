package SegundoDesafio;

import java.util.Scanner;

public class SegundoDesafio {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("N: ");
		Double valorTotal = dados.nextDouble();
		
		int notas = valorTotal.intValue();
        int moedas = (int) ((valorTotal - notas) * 100);
		
		System.out.println("");
		
		//Usar divisão por módulos!
		
		System.out.println("NOTAS:");
		
		int numNotasCem = notas / 100; //É feito a divisão exata para ter o número de notas de 100;
		notas -= numNotasCem * 100; //É retirado o valor das notas de 100 do valor total;
		System.out.println(numNotasCem + "    notas(s)     de      R$        100.00"); //Impressão da quantidade de notas;
		//Repetição do processo acima para o restante de notas e moedas;
		
		int numNotasCinquenta = notas / 50; 
		notas -= numNotasCinquenta * 50; 
		System.out.println(numNotasCinquenta + "    notas(s)     de      R$        50.00"); 
		
		int numNotasVinte = notas / 20; 
		notas -= numNotasVinte * 20; 
		System.out.println(numNotasVinte + "    notas(s)     de      R$        20.00"); 
		
		int numNotasDez = notas / 10; 
		notas -= numNotasDez * 10; 
		System.out.println(numNotasDez + "    notas(s)     de      R$        10.00"); 
		
		int numNotasCinco = notas / 5; 
		notas -= numNotasCinco * 5; 
		System.out.println(numNotasCinco + "    notas(s)     de      R$        5.00"); 
		
		int numNotasDois = notas / 2; 
		notas -= numNotasDois * 2; 
		System.out.println(numNotasDois + "    notas(s)     de      R$        2.00"); 
		
	
		System.out.println("MOEDAS:");
		
		int numMoedaUmR = notas; 
		notas -= numMoedaUmR * 1; 
		System.out.println(numMoedaUmR + "    moeda(s)     de      R$        1.00"); 
		
		int numMoedaCinquenta = moedas / 50; 
		moedas -= numMoedaCinquenta * 50; 
		System.out.println(numMoedaCinquenta + "    moeda(s)     de      R$        0.50"); 
		
		int numMoedaVinteCinco = moedas / 25; 
		moedas -= numMoedaVinteCinco * 25; 
		System.out.println(numMoedaVinteCinco + "    moeda(s)     de      R$        0.25"); 
		
		int numMoedaDez = moedas / 10; 
		moedas -= numMoedaDez * 10; 
		System.out.println(numMoedaDez + "    moeda(s)     de      R$        0.10"); 
		
		int numMoedaCinco = moedas / 5; 
		moedas -= numMoedaCinco * 5; 
		System.out.println(numMoedaCinco + "    moeda(s)     de      R$        0.05"); 
		
		int numMoedaUm = moedas / 1; 
		moedas -= numMoedaUm * 1; 
		System.out.println(numMoedaUm + "    moeda(s)     de      R$        0.01");
		
	}
	
}
