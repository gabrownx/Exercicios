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
public class CachorroTeste {
    public static void main(String[] args) {
        Cachorro c1  = new Cachorro();
        Cachorro c2 = new Cachorro();
        
        c1.nome = "Pluto";
        c1.idade = 2;
        
        c2.nome = "Snoopy";
        c2.idade = 4;
        
        System.out.println(c1.nome);
        c1.nivelStress = 10;
        c1.latir();
        
        System.out.println(c2.nome);
    }
}
