/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1.proglineal;

/**
 *
 * @author Gateway
 */
public class NumeroOpt {
    private int [] arreglo;

    public NumeroOpt(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public int calcular(){
        int min = arreglo[0];
        int index = 0;
        
        for(int i = 1; i < arreglo.length; i++){
            if(arreglo[i] < min){
                index = i;
                min = arreglo[i];
            }
        }
        return min >= 0 ? -1 : index; 
    }
}
