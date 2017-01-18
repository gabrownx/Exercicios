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
public class ContaTeste2 {
    public static void main(String[] args) {
        Conta d1 = new Conta();
        d1.sacar(200);
        d1.depositar(500);
        System.out.println(d1.consultarSaldo());
    }
}
