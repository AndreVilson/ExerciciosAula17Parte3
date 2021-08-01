package ExerciciosAula17;

import java.util.Scanner;

/*Altere o programa anterior para mostrar no final a soma dos números.*/

public class Ex11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o numero minimo, maximo :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		
		int numero;
		int total = 0;
		for (numero = num1; numero < num2; numero++) {

			if (numero > num1) {
				System.out.println(numero);
				total = numero + total;
			}
	
			
		}
		  System.out.println(total);
	}

}
