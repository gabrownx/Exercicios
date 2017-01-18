/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancojframe;

import javax.swing.JOptionPane;

/**
 *
 * @author alunoruy
 */
public class Banco {
    Conta[] contas;
    
    Banco(){
        int qntContas = Integer.parseInt(JOptionPane.showInputDialog("Quanta contas o banco terá?"));
        this.iniciarContas(qntContas);
    }
    
    void iniciarContas(int qntContas){
        contas = new Conta[qntContas];
    }
    
    void iniciarConta(){
        int posicao = getPosicaoVazia();
        contas[posicao] = new Conta();
        contas[posicao].numeroConta = 
        JOptionPane.showInputDialog("Digite o número da conta na posição "+posicao);
        String depositarStr = 
        JOptionPane.showInputDialog("Digite um valor para depositar");
        float depositar = Float.parseFloat(depositarStr);
        contas[posicao].depositar(depositar);
    }
    
    /**
     * Retorna a posição vazia do vetor
     * @return 
     */
    int getPosicaoVazia(){
        for(int i=0;i<contas.length;i++){
            if(contas[i] == null){
                return i;
            }
        }
        return -1;
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
