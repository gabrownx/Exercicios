package gabrownx;

import java.util.Scanner;

public class Calculadora_v2 {
/* ------------------------------
 * | 		CALCULADORA         |
 * | Versão do programa: 2.0    |
 * | Autor: Gabrownx            |
 * | Data: 28/08/2016	        |
 * ------------------------------
 */
	
	// Nota: A versão 2 é feita com DO-WHILE
	public static void main(String[] args) {
		System.out.println("               MENU             ");
		System.out.println(" -------------------------------");
		System.out.println("| 1) Somar       |   2) Subtrair|");
		System.out.println("| 3) Multiplicar |   4) Dividir |");
		System.out.println("| 0) Sair        |              |");
		System.out.println(" -------------------------------");

		Scanner in = new Scanner(System.in);

		int selecao = 0;
		double num1, num2, resultado = 0;

		do {

			System.out.print("Selecione uma opção: ");

			selecao = in.nextInt();

			if (selecao != 0 && selecao <= 4) {

				System.out.print("Digite o primeiro número: ");
				num1 = in.nextInt();

				System.out.print("Digite o segundo número: ");
				num2 = in.nextInt();

				if (selecao == 1) {
					resultado = num1 + num2;
				} else {
					if (selecao == 2) {
						resultado = num1 - num2;
					} else {
						if (selecao == 3) {
							resultado = num1 * num2;
						} else {
							if (selecao == 4) {
								resultado = num1 / num2;
							}
						}
					}
				}
				System.out.println("________________________");
				System.out.println("Resultado: " + resultado);
				System.out.println("------------------------");
			}
		} while (selecao != 0);
	}
}