/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;

public class Exercicio1005 {

	public static void main(String[] args) {

		{
			Scanner in = new Scanner(System.in);

			double A = in.nextDouble();
			double B = in.nextDouble();

			double MEDIA = ((A * 3.5) + (B * 7.5))/11;
			System.out.format("MEDIA = %.5f\n", MEDIA);
		}
	}
}

