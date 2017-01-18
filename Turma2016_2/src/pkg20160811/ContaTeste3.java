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
public class ContaTeste3 {
    public static void main(String[] args) {
        Conta contaProfessor =  new Conta();
        Conta contaAluno =  new Conta();
        
        contaProfessor.depositar(350);
        contaAluno.depositar(1500);
        
        contaProfessor.tranferirParaConta(contaAluno, 500);
        
        System.out.println("Professor: "+ contaProfessor.consultarSaldo());
        System.out.println("Aluno: "+contaAluno.consultarSaldo());
    }
}
