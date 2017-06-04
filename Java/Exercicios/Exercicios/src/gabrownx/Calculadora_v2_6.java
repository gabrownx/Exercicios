package gabrownx;

import java.util.Scanner;

public class Calculadora_v2_6 {
	/*
	 *  ------------------------------- 
	 * |	 	  CALCULADORA 			| 
	 * | Vers�o do programa: 2.6	  	| 
	 * | Autor: Gabrownx 				| 
	 * | Data: 29/08/2016 				| 
	 *  -------------------------------
	 */

	// Nota: A vers�o 2.6 � feita com SWITCH

	public static void main(String[] args) {
		System.out.println("               MENU             ");
		System.out.println(" -------------------------------");
		System.out.println("| 1) Somar       |   2) Subtrair|");
		System.out.println("| 3) Multiplicar |   4) Dividir |");
		System.out.println(" -------------------------------");

		Scanner in = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		double num1 = in.nextDouble();

		System.out.print("Digite o segundo n�mero: ");
		double num2 = in.nextDouble();

		System.out.print("Selecione uma opera��o: ");
		int selecao = in.nextInt();

		switch (selecao) {
		case 1:
			System.out.println("Resultado: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Resultado: " + (num1 - num2));
			break;
		case 3:
			System.out.println("Resultado: " + (num1 * num2));
			break;
		case 4:
			System.out.println("Resultado: " + (num1 / num2));
			break;
		default:
			System.out.println("Opera��o inv�lida!");
		}
	}
}