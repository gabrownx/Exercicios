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
public class Empresa_teste {
    public static void main(String[] args) {
        Empresa E1 = new Empresa();
        String totaldefuncionarios = JOptionPane.showInputDialog("DIGITE O NUMERO TOTAL DE FUNCIONARIOS");
        int totaldefuncionariosInt = Integer.parseInt(totaldefuncionarios);
        E1.funcionarios(totaldefuncionariosInt);
        
        for (int i=0;i<totaldefuncionariosInt;i++) {
            E1.funcionario(i);
            
        }
        System.out.println(E1);
           
               
                
           
               
     
    }
    
}
