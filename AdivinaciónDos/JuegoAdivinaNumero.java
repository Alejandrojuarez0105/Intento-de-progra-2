import java.util.Scanner;

class JuegoAdivinaNumero {
    private int numeroAleatorio;
    private Scanner scanner;

    public JuegoAdivinaNumero() {
        numeroAleatorio = (int) (Math.random() * 10);
        scanner = new Scanner(System.in);
    }

    public void simular() {
        System.out.println("He pensado un número, ¡adivínalo!");
        int intento1 = obtenerNumeroUsuario();

        if (intento1 == numeroAleatorio) {
            System.out.println("¡Adivinaste!");
        } else {
            System.out.println("No adivinaste");
            darPista(intento1);
            int intento2 = obtenerNumeroUsuario();

            if (intento2 == numeroAleatorio) {
                System.out.println("¡Adivinaste!");
            } else {
                System.out.println("No adivinaste, era " + numeroAleatorio);
            }
        }
    }

    private int obtenerNumeroUsuario() {
        return scanner.nextInt();
    }

    private void darPista(int numero) {
        if (numero > numeroAleatorio) {
            System.out.println("¡Es menor!");
        } else {
            System.out.println("¡Es mayor!");
        }
    }
}