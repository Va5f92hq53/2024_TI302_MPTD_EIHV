/*
Matematicas para la toma de deciciones
MANUAL DE PRCTICAS. Practica 3
Metodo Esquina Noroeste
Prof. Dr. Francisco Javier Montecillo Puente
Agosto - Diciembre 2024
Autor. Evelyn Iris Hernandez Vigil
30/10/2024
*/
package Unidad2;

public class TransporteSfbEN extends TransporteSfb{

    public void aplicarEsquinaNoroeste(int[] suministro, int[] demanda, int[][] asignacion) {
        int i = 0, j = 0;
        while (i < suministro.length && j < demanda.length) {
            if (suministro[i] == 0) {
                i++; 
                continue;
            }
            if (demanda[j] == 0) {
                j++; 
                continue;
            }

            int cantidad = Math.min(suministro[i], demanda[j]);
            asignacion[i][j] = cantidad;

            suministro[i] -= cantidad;
            demanda[j] -= cantidad;
        }
    }

    @Override
    public void sfb(int[] suministro, int[] demanda, int[][] asignacion, int[][] costos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
