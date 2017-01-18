package pkg20160811;

public class Funcionario {

    private String nome;
    private double salario;
    private Data dataDeEntrada;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = new Data(dataDeEntrada);
    }
    
    public void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
    
    public void setDataDeEntrada(int dia, int mes, int ano) {
        this.dataDeEntrada = new Data(dia, mes, ano);
    }
    
    
    public double recebeAumento(double aumento) {
        salario += salario * (aumento / 100);
        return salario;

    }

    public double ganhoAnual() {

        return salario * 12;
    }
    
    public void mostrarFuncionario() {

        System.out.println(this.toString());

    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno += ("Nome: " + this.nome)+"\n";
        retorno += ("Salario: " + this.salario)+"\n";
        retorno += ("Data de Entrada: " + this.dataDeEntrada)+"\n";
        retorno += ("Ganho Anual: " + this.ganhoAnual())+"\n";
        return retorno;
    }
     
}
