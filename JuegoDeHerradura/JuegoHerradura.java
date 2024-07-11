import java.util.Scanner;

class JuegoHerradura {
    private static final int PUNTAJE_MAXIMO = 50;
    private Jugador naneh;
    private Jugador armand;
    private int turno;

    public JuegoHerradura() {
        naneh = new Jugador("Naneh");
        armand = new Jugador("Armand");
        turno = 0;
    }

    public void simular() {
        boolean ganador = false;

        while (!ganador) {
            turno++;
            int nanehTurno = naneh.lanzamiento();
            int armandTurno = armand.lanzamiento();

            if (nanehTurno == armandTurno) {
                System.out.println("EMPATARON!");
                nanehTurno = 1;
                armandTurno = 1;
            }

            naneh.sumarPuntos(nanehTurno);
            armand.sumarPuntos(armandTurno);

            System.out.println("Turno [" + turno + "] / Naneh: [" + nanehTurno + "/" + naneh.getTotal()
                    + "] / Armand: [" + armandTurno + "/" + armand.getTotal() + "]");

            if (naneh.getTotal() > PUNTAJE_MAXIMO || armand.getTotal() > PUNTAJE_MAXIMO) {
                ganador = true;
            }
            new Scanner(System.in).nextLine();
        }
        System.out.println("Naneh: [" + naneh.getTotal() + "] / Armand: [" + armand.getTotal() + "]");
    }
}