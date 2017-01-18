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
public class Banco {
    Conta[] contas;
    
    void iniciarContas(int qntContas){
        contas = new Conta[qntContas];
    }
    
    void iniciarConta(int posicao){
        contas[posicao] = new Conta();
        contas[posicao].setNumeroConta(JOptionPane.showInputDialog("Digite o número da conta na posição "+posicao));
        String depositarStr = JOptionPane.showInputDialog("Digite um valor para depositar");
        float depositar = Float.parseFloat(depositarStr);
        contas[posicao].depositar(depositar);
    }
    
    @Override
    public String toString(){
        String retorno = "";
        for(int i=0;i<contas.length;i++){
            retorno+=contas[i].consultarSaldo()+"\n\n";
        }
        return retorno;
    }
    
}
