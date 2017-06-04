/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superm;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Produto {

    double preco;
    String nome, descricao;
    private int codigo, quantidade;

    void Produto(String nome, double preco, int quantidade, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    void atualizarQuantidade(int quantidadeextra) {
        quantidade = +quantidadeextra;
    }

    void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    int getQuantidade() {
        return this.quantidade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

}
