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
public class CanilTeste {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        
        c1.nome = JOptionPane.showInputDialog("Digite o nome do Cachorro!");
        String strIdade = JOptionPane.showInputDialog("Digite a Idade!");
        c1.idade = Integer.parseInt(strIdade);
        JOptionPane.showMessageDialog(null, c1.identidade());
    }
}
