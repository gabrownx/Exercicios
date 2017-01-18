package pkg20160811;

import javax.swing.JOptionPane;

public class Empresa {
    
    private Funcionario[] funcionarios;
    private String cnpj;
    
    void funcionarios(int qtdfuncionarios){
        funcionarios = new Funcionario[qtdfuncionarios];
    }
    
    void funcionario(int posicao){
        funcionarios[posicao] = new Funcionario();
        funcionarios[posicao].setNome(JOptionPane.showInputDialog("Digite o nome do funcionário" + posicao));
    }
    
   @Override
   public String toString(){
       String retorno = "";
       for(int i=0;i<funcionarios.length;i++){
           retorno+=funcionarios[i];
       }
       return retorno;
   }
   
   
}
