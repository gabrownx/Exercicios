/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20160811;

import javax.swing.JOptionPane;

/**
 *
 * @author alunoruy
 */
public class BancoTesta {
    public static void main(String[] args) {
        Banco bb = new Banco();
        
        String totalDeContasStr = JOptionPane.showInputDialog("Digite o total de contas");
        int totalDeContasInt = Integer.parseInt(totalDeContasStr);
        bb.iniciarContas(totalDeContasInt);
        
        for(int i=0;i<totalDeContasInt;i++){
            bb.iniciarConta(i);
        }
        System.out.println(bb);
    }
}
