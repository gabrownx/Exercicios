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
public class Conta {
   private String numeroConta;
   private float saldo = 0;
   private float limite = 1000;
   
   float getSaldo(){
       return this.saldo;
   }
   
   boolean setSaldo(float valor){
       String senha = JOptionPane.showInputDialog("Digite a senha do gerente");
       if(senha.equals("123")){
            this.saldo = valor;
            return true;
       }else{
           System.out.println("Senha Inválida");
           return false;
       }
   }
   
   void setNumeroConta(String conta){
       this.numeroConta = conta;
   }
   
   void depositar(float valor){
       this.saldo+=valor;
   }           
   
   boolean sacar(float valor){   
       if(valor<=this.saldo+this.limite){       
           this.saldo-=valor;
           return true;
       }else{
           return false;       
       }
   }  
   
   String consultarSaldo(){
       return "Número : " + this.numeroConta + "\nSaldo : " + this.saldo + "\nTotal disponivel " + (this.limite+this.saldo);
   }
   
   boolean tranferirParaConta(Conta c, float valor){
       if(this.sacar(valor)){
           c.depositar(valor);
           return true;
       }else{
           return false;
       }
   }
}
