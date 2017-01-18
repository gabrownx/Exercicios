/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import javax.swing.JOptionPane;

/**
 *
 * @author SC_DANIEL
 */
public class Cachorro {
    String nome;
    int idade;
    
    Cachorro(){
        this.nome = JOptionPane.showInputDialog("Qual o nome do Cachorro?");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do Cachorro?"));
    }
    
    void fazAniversario(){
        idade+=1;
    }
}
