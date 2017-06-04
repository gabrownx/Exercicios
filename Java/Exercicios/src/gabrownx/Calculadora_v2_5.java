package gabrownx;

import java.util.Scanner;

public class Calculadora_v2_5 {
	/*
	 *  ------------------------------- 
	 * |	 	  CALCULADORA 			| 
	 * | Vers�o do programa: 2.5	  	| 
	 * | Autor: Gabrownx 				| 
	 * | Data: 29/08/2016 				| 
	 *  -------------------------------
	 */

	// Nota: A vers�o 2.5 � feita com Operadores condicionais tern�rios
	
	public static void main(String[] args) {
		System.out.println("               MENU             ");
		System.out.println(" -------------------------------");
		System.out.println("| 1) Somar       |   2) Subtrair|");
		System.out.println("| 3) Multiplicar |   4) Dividir |");
		System.out.println(" -------------------------------");

		Scanner in = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		double num1 = in.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		double num2 = in.nextInt();
		
		System.out.print("Selecione uma opera��o: ");
		int selecao = in.nextInt();

		double resultado = 
				(selecao == 1) ? num1 + num2 : 
				(selecao == 2) ? num1 - num2 :
				(selecao == 3) ? num1 * num2 :
				(selecao == 4) ? num1 / num2 : 
					                        0;
		System.out.println("________________________");
		System.out.println("Resultado: " + resultado);
		System.out.println("------------------------");
	}
}