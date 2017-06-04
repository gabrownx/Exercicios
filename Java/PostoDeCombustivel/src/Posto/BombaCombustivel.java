package Posto;

import javax.swing.JOptionPane;

public class BombaCombustivel {

    int tipoCombustivel;
    double[] quantidadeCombustivel = new double[4];
    double[] valorLitro = new double[4];

    BombaCombustivel() {

        valorLitro[1] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do litro da gasolina?"));
        valorLitro[2] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do litro do álcool?"));
        valorLitro[3] = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do litro do diesel?"));
        quantidadeCombustivel[1] = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros tem na bomba de gasolina?"));
        quantidadeCombustivel[2] = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros tem na bomba de álcool?"));
        quantidadeCombustivel[3] = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros tem na bomba de diesel?"));

    }

    void abastecerPorValor(double dinheiro) {

        double litros = dinheiro / valorLitro[tipoCombustivel];
        alterarQuantidadeCombustivel(litros);
    }

    void abastecerPorLitro(double litros) {

        litros *= valorLitro[tipoCombustivel];
        alterarQuantidadeCombustivel(litros);
    }

    void alterarValor(double valor) {

        valorLitro[tipoCombustivel] = valor;
    }

    void alterarCombustivel(int tipoCombustivel) {

        switch (tipoCombustivel) {
            case 1:
                System.out.println("Você escolheu Gasolina.");
                break;
            case 2:
                System.out.println("Você escolheu Etanol.");
                break;
            case 3:
                System.out.println("Você escolheu Diesel.");
                break;
            case 4:
                break;
            default:
                System.out.println("Seleção inválida!");
                break;
        }
    }

    void alterarQuantidadeCombustivel(double abastecido) {
        quantidadeCombustivel[tipoCombustivel] -= abastecido;
    }

}
