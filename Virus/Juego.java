import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Mazo mazo;
    private Scanner scanner;

    public Juego() {
        jugadores = new ArrayList<>();
        mazo = new Mazo();
        scanner = new Scanner(System.in);
        inicializarJugadores();
    }

    private void inicializarJugadores() {
        System.out.println("Ingrese el número de jugadores (mínimo 2):");
        int numJugadores = scanner.nextInt();
        scanner.nextLine();

        while (numJugadores < 2) {
            System.out.println("Debe haber al menos dos jugadores. Ingrese el número de jugadores nuevamente:");
            numJugadores = scanner.nextInt();
        }

        for (int i = 1; i <= numJugadores; i++) {
            System.out.println("Ingrese el nombre del jugador " + i + ":");
            String nombre = scanner.nextLine();
            Jugador jugador = new Jugador(nombre);
            jugadores.add(jugador);

            for (int j = 0; j < 3; j++) {
                jugador.agregarCarta(mazo.robarCarta());
            }
        }
    }

    public void jugar() {
        boolean juegoTerminado = false;
        int ronda = 1;

        while (!juegoTerminado) {
            for (Jugador jugador : jugadores) {
                System.out.println("\nTurno de " + jugador.getNombre() + ":");
                jugador.mostrarMano();

                System.out.println("Elija una carta para jugar (1-" + jugador.getMano().size() + "):");
                int indiceCarta = scanner.nextInt() - 1;
                scanner.nextLine();

                if (indiceCarta >= 0 && indiceCarta < jugador.getMano().size()) {
                    Carta carta = jugador.getMano().get(indiceCarta);
                    jugador.jugarCarta(carta, this);
                } else {
                    System.out.println("Selección inválida");
                }

                if (jugador.haGanado()) {
                    System.out.println(jugador.getNombre() + " ha ganado el juego!");
                    juegoTerminado = true;
                    break;
                }

                jugador.agregarCarta(mazo.robarCarta());
            }
            ronda++;
            System.out.println("\n--- Fin de la Ronda " + (ronda - 1) + " ---\n");
        }

        System.out.println("Juego terminado!");
    }

    public Jugador seleccionarJugador() {
        System.out.println("Seleccione un jugador:");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
        }
        int indiceJugador = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indiceJugador >= 0 && indiceJugador < jugadores.size()) {
            return jugadores.get(indiceJugador);
        } else {
            System.out.println("Selección inválida");
            return null;
        }
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.jugar();
    }
}
