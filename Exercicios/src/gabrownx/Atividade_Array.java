package gabrownx;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade_Array {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int[] num = new int[7];
		int[] mult = new int[7];
		System.out.println("Digite 7 n�meros: ");
		
		int soma = 0, i;

		for (i = 0; i < 7; i++) {
			num[i] = ent.nextInt(); // Recebendo os n�meros do usu�rio e salvndo no array
			soma += num[i]; // Soma de todos os n�meros digitados
			mult[i] = num[i] * i;
		}

		int media = soma / (i);

		System.out.println("A soma de todos os n�meros �: " + soma);
		System.out.println("A multiplica��o do �ndice pelo seu valor �: " + Arrays.toString(mult));
		System.out.println("A m�dia aritm�tica de todos os n�meros �: " + media);

	}
}
