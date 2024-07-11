import java.util.Scanner;

class JuegoGuacamole {
    private static final int TURNOS_MAXIMOS = 15;
    private int turnos;
    private int aciertos;
    private Scanner scanner;
    private Tablero tablero;

    public JuegoGuacamole() {
        this.turnos = 0;
        this.aciertos = 0;
        this.scanner = new Scanner(System.in);
        this.tablero = new Tablero();
    }

    public void simular() {
        for (turnos = 0; turnos <= TURNOS_MAXIMOS; turnos++) {
            System.out.println("Elige qué casilla quieres golpear:");
            int casilla = scanner.nextInt();
            int casillaOcupada = (int) (Math.random() * (16 - 1) + 1);

            if (casilla == casillaOcupada) {
                aciertos++;
            }

            tablero.imprimir(casilla, casillaOcupada, turnos, aciertos);
        }
    }
}