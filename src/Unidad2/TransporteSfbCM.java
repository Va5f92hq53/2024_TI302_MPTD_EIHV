package Unidad2;

public class TransporteSfbCM extends TransporteSfb {

   @Override
    public void sfb(int[] suministro, int[] demanda, int[][] asignacion, int[][] costos) {
        int filas = suministro.length;
        int columnas = demanda.length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asignacion[i][j] = 0;
            }
        }

       
        while (true) {
            // Encontrar la celda con el costo mínimo
            int minCosto = Integer.MAX_VALUE;
            int minFila = -1;
            int minColumna = -1;

            for (int i = 0; i < filas; i++) {
                if (suministro[i] == 0) {
                    continue;
                }
                for (int j = 0; j < columnas; j++) {
                    if (demanda[j] == 0) {
                        continue;  
                    }
                    if (costos[i][j] < minCosto) {
                        minCosto = costos[i][j];
                        minFila = i;
                        minColumna = j;
                    }
                }
            }

            if (minFila == -1 || minColumna == -1) {
                break;
            }

            int cantidad = Math.min(suministro[minFila], demanda[minColumna]);
            asignacion[minFila][minColumna] = cantidad;
            suministro[minFila] -= cantidad;
            demanda[minColumna] -= cantidad;

            if (suministro[minFila] == 0) {
                for (int j = 0; j < columnas; j++) {
                    costos[minFila][j] = Integer.MAX_VALUE;
                }
            }
            if (demanda[minColumna] == 0) {
                for (int i = 0; i < filas; i++) {
                    costos[i][minColumna] = Integer.MAX_VALUE;
                }
            }
        }
    }
}
    

