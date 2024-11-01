package Unidad2;

public class TransporteTest {

    public static void main(String[] args) {
//        int[] oferta = {5, 1, 3};
//        int[] demanda = {2, 4, 2, 1};
//
//        int[][] asignacion = new int[oferta.length][demanda.length];
//
//        TransporteSfbEN transporte = new TransporteSfbEN();
//        transporte.aplicarEsquinaNoroeste(oferta, demanda, asignacion);
//
//        System.out.println("Esquina Noroeste");
//        for (int i = 0; i < asignacion.length; i++) {
//            for (int j = 0; j < asignacion[i].length; j++) {
//                if (asignacion[i][j] != 0 || (i == 2 && j == 1)) {
//                    System.out.print(asignacion[i][j] + "\t");
//                } else {
//                    System.out.print(" \t");
//                }
//            }
//            System.out.println();
//
//        }
        int[] suministro = {5, 10, 15};
        int[] demanda = {12, 8, 4, 6};
        int[][] costos = {
            {2, 3, 5, 6},
            {2, 1, 3, 5},
            {3, 8, 4, 6}
        };
        int[][] asignacion = new int[suministro.length][demanda.length];

        TransporteSfbCM transporte = new TransporteSfbCM();
        transporte.sfb(suministro, demanda, asignacion, costos);

        // Imprimir la matriz de asignación
        for (int i = 0; i < asignacion.length; i++) {
            for (int j = 0; j < asignacion[0].length; j++) {
                System.out.print(asignacion[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
