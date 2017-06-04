package gabrownx;

import java.util.Random;
import java.util.Scanner;

public class Numeros_aleatorios {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Quantos números você quer? Digite:");

		int qnt = in.nextInt();

		if (qnt > 0) {
			System.out.print("Digite um número máximo: ");
			int max = in.nextInt();
			System.out.println("__________________________________");
			System.out.println("Número(s) aleatório(s) gerado(s): ");

			for (int i = 0; i < qnt; ++i) {
				Random num = new Random();
				System.out.println(num.nextInt(max));
			}
		} else {
			System.out.print("Opção inválida");
		}
	}
}