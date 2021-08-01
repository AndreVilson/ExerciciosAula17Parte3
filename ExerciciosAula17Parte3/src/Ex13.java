package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.*/

public class Ex13 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero base:");
		int base = scan.nextInt();
		
		System.out.println("Digite o numero expoente:");
		int expoente = scan.nextInt();
		
		int cont = 1;
		int potencia = base;
		while(cont < expoente) {
			potencia = base * potencia; 
			cont++;
		}
		System.out.println("Potência: " + potencia);
		
		
	}

}
