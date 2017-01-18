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

public class Exercicio1002 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double pi = 3.14159;

		double raio = in.nextDouble();

		double area = pi * (raio * raio);
		
		System.out.format("A=%.4f", area);
	}
}
    /**
     * @param args the command line arguments
     */
    
