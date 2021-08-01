package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.*/

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Quantos números irá inserir?");
		int qtdNumeros = scan.nextInt();
		
		System.out.println("Números digitados:");
		int numerosDigitados = 0;
		int contPar = 0;
		int contImpar = 0;
		
		for(int cont = 0; cont < qtdNumeros;cont++) {
			
			
			 numerosDigitados = scan.nextInt();
			if(numerosDigitados % 2 == 0) {
				System.out.println("Par ");
				contPar++;
			}else {
				System.out.println("Impar ");
				contImpar++;
			}
		
		}
	
		System.out.println("Quantidade de números Pares: " + contPar);
		System.out.println("Quantidade de números Impares: " + contImpar);
		
		
		
		
		
	}

}
