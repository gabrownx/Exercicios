/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancojframe;

/**
 *
 * @author alunoruy
 */
public class Conta {
   String numeroConta;
   float saldo = 0;
   float limite = 1000;
   
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
