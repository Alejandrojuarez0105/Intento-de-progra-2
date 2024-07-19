import java.util.Scanner;

class Turno {
    private Camello jugador;
    private Camello ordenador;
    private Scanner entrada;
    private int conteoFallos;

    public Turno(Camello jugador, Camello ordenador, Scanner entrada) {
        this.jugador = jugador;
        this.ordenador = ordenador;
        this.entrada = entrada;
        this.conteoFallos = 0;
    }

    public void realizar() {
        System.out.println("Elija un agujero:");
        int opcionUsuario = entrada.nextInt();
        int avanceUsuario = jugador.avanzar(opcionUsuario);

        if (avanceUsuario == 0) {
            conteoFallos++;
        } else {
            conteoFallos = 0;
        }

        if (conteoFallos >= 3) {
            jugador.resetearPosicion();
            conteoFallos = 0;
        }

        if (jugador.tropieza()) {
            ordenador.avanzarTurnosExtra(2);
        }

        ordenador.avanzar();
    }
}