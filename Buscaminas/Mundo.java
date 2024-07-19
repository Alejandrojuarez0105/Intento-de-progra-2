import java.util.Scanner;

class Mundo {
    private Mapa mapa;

    public Mundo(int filas, int columna, int numMinas) {
        mapa = new Mapa(filas, columna, numMinas);
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            mapa.mostrarMapa();
            System.out.println("Ingrese las coordenadas (fila, columna)");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            Coordenada coordenada = new Coordenada(fila, columna);
            if (mapa.descubrirCasilla(coordenada)) {
                System.out.println("!BOOOOM¡" + " GAME OVER ");
                juegoTerminado = true;
            } else if (mapa.esMapaDescubierto()) {
                System.out.println("FELICIDADES GANASTE");
                juegoTerminado = true;
            }
        }
        scanner.close();
        mapa.mostrarMapa();
    }
}
