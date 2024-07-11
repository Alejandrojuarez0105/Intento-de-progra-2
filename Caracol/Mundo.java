import java.util.Scanner;

class Mundo {
    private Caracol caracol;
    private Pozo pozo;
    private Cansancio cansancio;
    private Coches coches;
    private Clima clima;

    public Mundo() {
        double caida = (Math.random() * 10) + 10;
        this.caracol = new Caracol(caida);
        this.pozo = new Pozo();
        this.cansancio = new Cansancio();
        this.coches = new Coches();
        this.clima = new Clima();
    }

    public void iniciar() {
        while (caracol.estaVivo()) {
            int subida = 0, bajada = 0;

            if (caracol.getContador() <= 10) {
                subida = (int) (Math.random() * 3) + 1;
                bajada = (int) (Math.random() * 2);
            } else if (caracol.getContador() <= 20) {
                subida = (int) (Math.random() * 3);
                bajada = (int) (Math.random() * 2);
            } else if (caracol.getContador() < 50) {
                subida = (int) (Math.random() * 2);
                bajada = (int) (Math.random() * 2);
            }

            caracol.mover(subida, bajada);
            System.out.println(
                    "Día " + caracol.getContador() + " El caracol subió " + subida + "m y bajó " + bajada + "m");

            aplicarEfectos();

            pozo.mostrarEstado(caracol);

            if (caracol.getAltura() >= 0) {
                caracol.setVida(false);
                System.out.println("El caracol consiguió salir del pozo!");
            } else if (caracol.getContador() >= 50) {
                caracol.setVida(false);
                System.out.println("El caracol murió ¡GAME OVER!");
            }
        }
    }

    private void aplicarEfectos() {
        cansancio.aplicarEfecto(caracol);
        coches.aplicarEfecto(caracol);
        clima.aplicarEfecto(caracol);
    }

    public static void main(String[] args) {
        Mundo mundo = new Mundo();
        mundo.iniciar();
    }
}