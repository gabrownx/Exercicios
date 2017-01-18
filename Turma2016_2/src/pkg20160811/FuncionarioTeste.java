
package pkg20160811;


public class FuncionarioTeste {
   
    public static void main(String[] args){
        
      Funcionario f1 = new Funcionario();
      
      f1.setNome("Marcus");
      f1.setSalario(200);      
      f1.setDataDeEntrada("8/5/10");
      
      f1.recebeAumento(10);
      
      f1.mostrarFuncionario();
    }
}
