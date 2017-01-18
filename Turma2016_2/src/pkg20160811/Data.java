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
public class Data {

    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public Data(String data){
        String[] parts = data.split("/");
        this.dia = Integer.parseInt(parts[0]);
        this.mes = Integer.parseInt(parts[1]);
        this.ano = Integer.parseInt(parts[2]);
    }
    
    public Data(){
        this.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia"));
        this.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o Mes"));
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano"));
    }
    
    @Override
    public String toString() {
        String data = "";
        if (dia < 10) {
            data += "0";
        }
        data += dia + "/";
        if (mes < 10) {
            data += "0";
        }
        data += mes + "/";
        if (ano < 10) {
            data += "0";
        }
        data += ano;
        return data;
    }

}
