import java.util.Scanner;

class Mundo {

    private Beca ordenacionAcademica;
    private int tiempoTotal;

    public Mundo(int tiempoTotal) {
        ordenacionAcademica = new Beca();
        this.tiempoTotal = tiempoTotal;
    }

    public void simular() {
        boolean estaEnBeca = true;
        int minutoActual = 0;

        do {
            minutoActual++;
            estaEnBeca = minutoActual <= this.tiempoTotal;

            if (llegaUnProfesor()) {
                Profesor profesor = new Profesor();
                ordenacionAcademica.recibe(profesor);
            }
            ordenacionAcademica.actualizar();
            ordenacionAcademica.verEstado(minutoActual);
            new Scanner(System.in).nextLine();
        } while (estaEnBeca);

    }

    private boolean llegaUnProfesor() {
        return Math.random() <= 0.9;
    }

    public static void main(String[] args) {
        final int TIEMPO_TOTAL = 4 * 60;
        new Mundo(TIEMPO_TOTAL).simular();
    }
}