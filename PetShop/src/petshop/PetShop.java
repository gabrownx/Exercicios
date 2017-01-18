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
public class PetShop {
    Cachorro[] cachorros;
    String nome;
    
    PetShop(){
        this.nome = JOptionPane.showInputDialog("Qual o nome do PetShop?");
        int qntCachorros = Integer.parseInt(JOptionPane.showInputDialog("Quantos Cachorros terá no PetShop?"));
        this.cachorros = new Cachorro[qntCachorros];
    }
    
    /**
     * Adiciona um novo cachorro no Vetor
     */
    void add(){
        int posicao = getPosicaoVazia();
        if(posicao!=-1){
            this.cachorros[posicao] = new Cachorro();
            JOptionPane.showMessageDialog(null, "Cachorro adicionado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Não existe mais espaço para outro cachorro!");
        }
    }
    
    void remove(int posicao){
        this.cachorros[posicao] = null;
    }
    
    /**
     * Retorna a posição vazia do vetor
     * @return 
     */
    int getPosicaoVazia(){
        for(int i=0;i<cachorros.length;i++){
            if(cachorros[i] == null){
                return i;
            }
        }
        return -1;
    }
    
    int somaIdadeCachorros(){
        int total = 0;
        for(int i=0;i<cachorros.length;i++){
            if(cachorros[i] == null){
                continue;
            }
            total+=cachorros[i].idade;
        }
        return total;
    }
}
