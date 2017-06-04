package gabrownx;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade_Array {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int[] num = new int[7];
		int[] mult = new int[7];
		System.out.println("Digite 7 números: ");
		
		int soma = 0, i;

		for (i = 0; i < 7; i++) {
			num[i] = ent.nextInt(); // Recebendo os números do usuário e salvndo no array
			soma += num[i]; // Soma de todos os números digitados
			mult[i] = num[i] * i;
		}

		int media = soma / (i);

		System.out.println("A soma de todos os números é: " + soma);
		System.out.println("A multiplicação do índice pelo seu valor é: " + Arrays.toString(mult));
		System.out.println("A média aritmética de todos os números é: " + media);

	}
}
