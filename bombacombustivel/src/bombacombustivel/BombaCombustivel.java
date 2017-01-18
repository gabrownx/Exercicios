/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombacombustivel;

import javax.swing.JOptionPane;

/**
 *
 * @author alunoruy
 */
public class BombaCombustivel {
    
    private String tipoCombustivel;
    private float valorLitro;
    private float quantidadeCombustivel;

    public BombaCombustivel() {
        alterarTipoCombustivel();
        alterarValorLitro();
        alterarQuantidadeCombustivel();    
    }
    
    float abastecerPorValor(float valor){
        float totalDeLitros = valor/this.valorLitro;
        if(totalDeLitros <= quantidadeCombustivel){
            quantidadeCombustivel-=totalDeLitros;
            return totalDeLitros;
        }
        return 0;        
    }
    
    float abastecerPorLitro(float litros){
        float totalAPagar = 0;
        if(litros<=quantidadeCombustivel){
            totalAPagar = valorLitro*litros;
            quantidadeCombustivel-=litros;
        }
        return totalAPagar;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void alterarTipoCombustivel() {
        this.tipoCombustivel = JOptionPane.showInputDialog("Qual o Tipo de Combustivel?");
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void alterarValorLitro() {
        String valor = JOptionPane.showInputDialog("Qual o valor do litro?");
        this.valorLitro = Float.parseFloat(valor);
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void alterarQuantidadeCombustivel() {
        String valor = JOptionPane.showInputDialog("Qual a quantidade de combustivel?");
        this.quantidadeCombustivel = Float.parseFloat(valor);
    }
    
    
    
}
