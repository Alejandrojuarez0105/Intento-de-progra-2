import java.util.Scanner;

class Carrera {
    private static final String REGLETA = "---+-----------+---------+---------+---------+---------+-----------+";
    private static final String POSICIONES = "---| 0.........1.........2.........3.........4.........5.........6 |\n---| 0123456789012345678901234567890123456789012345678901234567890 |";
    private static final String CAMELLO = ";--;'";
    private static final int POSICION_FINAL = 60;
    private static final int NUMERO_TURNOS = 50;

    private Camello jugador;
    private Camello ordenador;
    private int conteoTurno;
    private boolean hayGanador;
    private boolean quedanTurnos;
    private Scanner entrada;

    public Carrera() {
        jugador = new Camello("Jugador");
        ordenador = new Camello("Ordenador");
        conteoTurno = 0;
        hayGanador = false;
        quedanTurnos = true;
        entrada = new Scanner(System.in);
    }

    public void simular() {
        while (!hayGanador && quedanTurnos) {
            Turno turno = new Turno(jugador, ordenador, entrada);
            turno.realizar();
            conteoTurno++;
            imprimirEstado();

            if (jugador.getPosicion() >= POSICION_FINAL || ordenador.getPosicion() >= POSICION_FINAL) {
                hayGanador = true;
            }

            if (conteoTurno >= NUMERO_TURNOS) {
                quedanTurnos = false;
            }
        }
        finalizarCarrera();
    }

    private void imprimirEstado() {
        System.out.println(REGLETA);
        System.out.println(POSICIONES);
        System.out.println(REGLETA);

        jugador.imprimirCamello();
        System.out.println(REGLETA);

        ordenador.imprimirCamello();
        System.out.println(REGLETA);

        System.out.println("Turno [" + conteoTurno + "] - Avanza [" + jugador.getUltimoAvance()
                + "] casillas - Está en la casilla [" + jugador.getPosicion() + "]");
    }

    private void finalizarCarrera() {
        String descripcionAdicional;

        if (!quedanTurnos) {
            descripcionAdicional = "Se han agotado los turnos!";
        } else if (jugador.getPosicion() > ordenador.getPosicion()) {
            descripcionAdicional = "Ganó el jugador!";
        } else {
            descripcionAdicional = "Ganó el ordenador!";
        }

        System.out.println("PARTIDA TERMINADA > " + descripcionAdicional);
        entrada.close();
    }
}