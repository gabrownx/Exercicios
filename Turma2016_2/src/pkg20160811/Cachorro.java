/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20160811;

/**
 *
 * @author alunoruy
 */
public class Cachorro {
    String nome;
    int idade;
    int nivelStress = 1;
    
    void latir(){
        for(int i = 0; i<nivelStress; i++){
            System.out.println((i+1)+" Au");
        }
    }
    
    String identidade(){
        return "Nome: " + nome + " Idade:" + String.valueOf(idade);
    }
}
