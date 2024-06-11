import java.util.Scanner;

class Blackjack {
    private Baraja baraja;
    private Mano mano;

    public Blackjack() {
        baraja = new Baraja();
        mano = new Mano(baraja);
    }

    public void jugar() {
        boolean estaJugando = true;
        do {

            mano.mostrar();
            mostrarMenu();
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    if (!mano.haGanado() && !mano.haPerdido()) {
                        mano.pedir(baraja);
                    }
                    break;
                case 2:
                    baraja = new Baraja();
                    mano = new Mano(baraja);
                    break;
                case 3:
                    estaJugando = false;
                    break;
            }
        } while (estaJugando);
    }

    private void mostrarMenu() {
        System.out.println("1. Pedir");
        System.out.println("2. Empezar de nuevo");
        System.out.println("3. Salir");
    }

    public static void main(String[] args) {
        new Blackjack().jugar();
    }

}