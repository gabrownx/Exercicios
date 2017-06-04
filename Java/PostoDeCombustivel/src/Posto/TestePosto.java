package Posto;

import java.util.Scanner;

public class TestePosto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BombaCombustivel bomba = new BombaCombustivel();
		
		bomba.alterarCombustivel(1); // Altera o combustível : 1- Gasolina | 2 - Alcool | 3 - Diesel
		bomba.alterarQuantidadeCombustivel(0); // Altera a quantidade de combustível disponível na bomba.
		bomba.abastecerPorLitro(0);	// Abastece o "carro" escolhendo a quantidade de litros.
		bomba.abastecerPorValor(0); // Abastece o "carro" com um valor em dinheiro
		bomba.alterarValor(0); // Altera o valor do combustível selecionado.

	}
}