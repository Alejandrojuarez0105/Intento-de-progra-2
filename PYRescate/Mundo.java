import java.util.Scanner;

public class Mundo {

    private Mapa mapa;
    private int turnosTotales;
    private Estadisticas estadisticas;
    private Jugador jugador;
    private static final int SOLDADOS_INICIALES = 16;

    public Mundo(int turnosTotales) {
        mapa = new Mapa(8, 8);
        this.turnosTotales = turnosTotales;
        estadisticas = new Estadisticas();
        this.jugador = new Jugador();
        inicializarSoldados();
    }

    private void inicializarSoldados() {
        for (int i = 0; i < SOLDADOS_INICIALES; i++) {
            Soldado soldado = new Soldado();
            mapa.caen(soldado);
        }
    }

    public void jugar() {
        boolean estaJugando = true;
        int turnoActual = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            mapa.imprimir();
            System.out.println("Por favor, ingrese la coordenada para rescatar un soldado");
            System.out.print("Fila: ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Columna: ");
            int columna = scanner.nextInt() - 1;
            if (mapa.rescatarSoldado(fila, columna)) {
                System.out.println("¡Soldado rescatado!");
                estadisticas.registrarRescate();
                if (estadisticas.getSoldadosRescatados() == SOLDADOS_INICIALES) {
                    System.out.println("GANASTE");
                    break;
                }
            } else {
                System.out.println("No hay soldado en esa casilla.");
            }
            turnoActual++;
            System.out.println("Estas en el turno " + turnoActual);
            estadisticas.soldadosRescatados();
            estaJugando = turnoActual <= this.turnosTotales;
            if (!estaJugando) {
                System.out.println("PERDISTE");

            }
            scanner.nextLine();
        } while (estaJugando);
        if (estadisticas.getSoldadosRescatados() != SOLDADOS_INICIALES) {
            System.out.println("=".repeat(70));
            estadisticas.mostrar();
            System.out.println("=".repeat(70));
            System.out.println("Aquí estaban los que te faltaban");
            mapa.imprimirFinal();

        }

    }

    public static void main(String[] args) {
        final int TURNOS_TOTALES = 50;
        new Mundo(TURNOS_TOTALES).jugar();
    }
}