import java.util.Scanner;

class Juego {
    private static final int TIEMPO_TOTAL = 120;
    private static final int NINOS_MINIMOS = 5;

    private int lydiaCount = 0;
    private int aishaCount = 0;

    private boolean estaJugando = false;
    private Mensaje mensaje;
    private int turnoNino = 0;

    public void jugar() {
        for (int minuto = 0; minuto <= TIEMPO_TOTAL; minuto++) {
            limpiarPantalla();
            System.out.println("=".repeat(30));
            System.out.println("Ludoteca PRG1 - minuto " + minuto);
            if (ninoLlega(minuto)) {
                lydiaCount++;
            }
            if (!estaJugando) {
                aishaCount += lydiaCount;
                lydiaCount = 0;
                mostrarCola("Lydia", lydiaCount);
                mostrarCola("Aisha", aishaCount);
            } else {
                mostrarCola("Lydia", lydiaCount);
                mostrarCola("Aisha", aishaCount, turnoNino);
            }
            if (aishaCount >= NINOS_MINIMOS && !estaJugando) {
                estaJugando = true;
                mensaje = new Mensaje("Dicen que el examen estará difícil. ¡Pásalo!");
                System.out.println("Aisha empieza a jugar pasando este mensaje: " + mensaje.getTexto());
                turnoNino = 1;
            } else if (estaJugando) {
                System.out.println("🗨️: " + mensaje.getTexto());
                mensaje.alterarMensaje();
                turnoNino++;
                estaJugando = turnoNino <= aishaCount;
            }
            new Scanner(System.in).nextLine();
        }
    }

    private boolean ninoLlega(int minuto) {
        final double PROBABILIDAD_LLEGADA = 0.3;
        final int LIMITE_TIEMPO_LLEGADA = 40;
        return Math.random() < PROBABILIDAD_LLEGADA && minuto < LIMITE_TIEMPO_LLEGADA;
    }

    private void mostrarCola(String responsable, int numeroDeNinos) {
        mostrarCola(responsable, numeroDeNinos, 0);
    }

    private void mostrarCola(String responsable, int numeroDeNinos, int turnoNino) {
        final String NINOS = "🧒";
        final String HABLANTE = "🗨️ ";

        String cola = turnoNino > 0
                ? NINOS.repeat(turnoNino - 1) + HABLANTE + NINOS.repeat(numeroDeNinos - turnoNino)
                : NINOS.repeat(numeroDeNinos);
        System.out.println(responsable + " > " + cola);
        System.out.println("-".repeat(30));
    }

    private void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}