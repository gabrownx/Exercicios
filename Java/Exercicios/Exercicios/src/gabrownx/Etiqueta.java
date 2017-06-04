package gabrownx;

import java.util.Scanner;	

public class Etiqueta {

		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			Scanner string = new Scanner(System.in);
			
			System.out.println("Digite seu nome: ");
				String nome = string.nextLine();
			
			System.out.println("Digite seu CEP: ");
				int CEP = in.nextInt();
			
			System.out.println("Digite o nome da rua: ");
				String end = string.nextLine();
			
			System.out.println("Digite seu telefone: ");
				int tel = in.nextInt();
				
			System.out.println("Etiqueta gerada com sucesso!");
			System.out.println(nome + ", " + CEP + ", " + end + ", " + tel);
			
		}
		
}
