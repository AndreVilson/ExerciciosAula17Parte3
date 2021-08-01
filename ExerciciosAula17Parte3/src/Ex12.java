package ExerciciosAula17;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada.*/

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o numero da tabuada:");
		int tabuada = scan.nextInt();
		
		System.out.println("Tabuada de " + tabuada + ":");
		
		for(int cont = 0; cont <=10; cont++) {
			int resultado = tabuada * cont;
			System.out.println(tabuada + " x " + cont + " = " + resultado);
		}
	}

}
