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
public class Data {
    
public int dia;
public int mes;
public int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
    }

    @Override
    public String toString() {
        String data = " ";
        if(dia < 10){
            data += "0";
        }
        data += dia +"/";
        if(mes<10){
            data += "0";        
        }
        data+= mes + "/";
        if(ano<10){
            data+="0";
        }
        data +=ano;
        return data;
        
        
        
        
        
    }

 
}
