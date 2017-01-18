/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20160811;

/**
 *
 * @author alunoruy
 */
public class ContaTeste {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        if (c1.setSaldo(1000)) {
            c1.depositar(100);
            if (c1.sacar(1090)) {
                System.out.println("Sacado com sucesso");
            } else {
                System.out.println("Saldo insuficiente");
            }
            System.out.println(c1.consultarSaldo());

            if (c1.sacar(20)) {
                System.out.println("Sacado com sucesso");
            } else {
                System.out.println("Saldo insuficiente");
            }
            System.out.println(c1.consultarSaldo());
            System.out.println(c1.getSaldo());
        }
    }

}
