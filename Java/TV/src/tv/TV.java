/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

/**
 *
 * @author alunoruy
 */
public class TV {
    
    private boolean ligado = false;
    
    private int canal = 1;
    private int volume = 0;
    
    private int canalMin = 1;
    private int canalMax = 10;
    
    private int volumeMin = 0;
    private int volumeMax = 10;
    
    void aumentaVolume(){
        if(ligado && volume+1 <= volumeMax){
            volume++;
        }
    }
    void diminuiVolume(){
        if(ligado && volume-1 >= volumeMin){
            volume--;
        }
    }
    void aumentaCanal(){
        if(ligado && canal+1 <= canalMax){
            canal++;
        }
    }
    void diminuiCanal(){
        if(ligado && canal-1 >= canalMin){
            canal--;
        }
    }
    
    boolean getLigado(){
        return ligado;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
    
    void switchLigado(){
        ligado = !ligado;
    }
    
}
