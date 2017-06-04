/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;

public class Exercicio1006 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double A = in.nextDouble();
		double B = in.nextDouble();
		double C = in.nextDouble();
		
		double MEDIA = ((A*2) + (B*3) + (C*5))/10;
		
		System.out.format("MEDIA = %.1f\n");
	}
}