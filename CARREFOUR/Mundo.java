package src;

import java.util.Scanner;

class Mundo {

    private CentroComercial carrefour;
    private int tiempoTotal;
    private Estadisticas estadisticas;

    public Mundo(int tiempoTotal) {
        carrefour = new CentroComercial();
        this.tiempoTotal = tiempoTotal;
        estadisticas = new Estadisticas();
    }

    public void simular() {
        boolean centroAbierto = true;
        int minutoActual = 0;

        do {
            minutoActual++;
            centroAbierto = minutoActual <= this.tiempoTotal;
            if (llegaUnCliente()) {
                Cliente cliente = new Cliente();
                carrefour.recibe(cliente);
            }
            carrefour.actualizar();
            if (carrefour.colaVacia()) {
                estadisticas.incrementarMinutosSinCola();
            }
            carrefour.verEstado(minutoActual);
            new Scanner(System.in).nextLine();
        } while (centroAbierto);
        estadisticas.actualizarEstadisticas(carrefour);

        System.out.println("=".repeat(70));
        estadisticas.mostrar();
        System.out.println("=".repeat(70));
    }

    private boolean llegaUnCliente() {
        return Math.random() <= 0.4;
    }

    public static void main(String[] args) {
        final int TIEMPO_TOTAL = 12 * 60;
        new Mundo(TIEMPO_TOTAL).simular();
    }
}