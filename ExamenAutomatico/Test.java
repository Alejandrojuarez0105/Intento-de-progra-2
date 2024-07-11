import java.util.Scanner;

public class Test {
    private static final int FACIL = 1;
    private static final int NORMAL = 2;
    private static final int DIFICIL = 3;

    private int primerFactor;
    private int dificultad;
    private Scanner scanner;

    public Test(int primerFactor, int dificultad, Scanner scanner) {
        this.primerFactor = primerFactor;
        this.dificultad = dificultad;
        this.scanner = scanner;
    }

    public void ejecutar() {
        double puntos = 0;
        int bienRespondidas = 0;
        int malRespondidas = 0;
        int preguntas = 5;

        for (int i = 1; i <= preguntas; i++) {
            int segundoFactor = generarSegundoFactor();

            System.out.println("¿Cuánto es " + primerFactor + " x " + segundoFactor + "?");
            int respuestaUsuario = scanner.nextInt();
            int respuestaCorrecta = primerFactor * segundoFactor;

            if (respuestaUsuario == respuestaCorrecta) {
                puntos += 2;
                bienRespondidas++;
            } else {
                puntos -= 0.5;
                malRespondidas++;
            }
        }

        mostrarResultados(puntos, bienRespondidas, malRespondidas);
    }

    private int generarSegundoFactor() {
        switch (dificultad) {
            case FACIL:
                return (int) (Math.random() * 5) + 1;
            case NORMAL:
                return (int) (Math.random() * 9) + 1;
            case DIFICIL:
                return (int) (Math.random() * 6) + 4;
            default:
                return 1;
        }
    }

    private void mostrarResultados(double puntos, int bienRespondidas, int malRespondidas) {
        System.out.println("Resultados del Test:");
        System.out.println("Puntos: " + puntos);
        System.out.println("Bien respondidas: " + bienRespondidas);
        System.out.println("Mal respondidas: " + malRespondidas);
    }
}
