import java.util.Scanner;

public class Juego {
    private Jugador[] jugadores;
    private Mazo mazo;
    private Scanner scanner;

    public Juego() {
        scanner = new Scanner(System.in);
        mazo = new Mazo();
        jugadores = new Jugador[0];
        inicializarJugadores();
    }

    private void inicializarJugadores() {
        System.out.println("Ingrese el número de jugadores (mínimo 2):");
        int numJugadores = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        while (numJugadores < 2) {
            System.out.println("Debe haber al menos dos jugadores. Ingrese el número de jugadores nuevamente:");
            numJugadores = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea nuevamente
        }

        jugadores = new Jugador[numJugadores]; // Inicializa el array de jugadores con el tamaño correcto

        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Ingrese el nombre del jugador " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            while (nombre.trim().isEmpty()) { // Verificar si el nombre ingresado es vacío
                System.out.println("El nombre del jugador no puede ser vacío. Ingrese el nombre nuevamente:");
                nombre = scanner.nextLine();
            }
            Jugador jugador = new Jugador(nombre);
            jugadores[i] = jugador; // Asigna el jugador al array

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

                System.out.println("Elija una carta para jugar (1-" + jugador.getMano().length + "):");
                int indiceCarta = scanner.nextInt() - 1;
                scanner.nextLine();

                if (indiceCarta >= 0 && indiceCarta < jugador.getMano().length) {
                    Carta carta = jugador.getMano()[indiceCarta];
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
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println((i + 1) + ". " + jugadores[i].getNombre());
        }
        int indiceJugador = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indiceJugador >= 0 && indiceJugador < jugadores.length) {
            return jugadores[indiceJugador];
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