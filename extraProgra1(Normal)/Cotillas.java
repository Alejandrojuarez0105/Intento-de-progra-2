import java.util.Scanner;

class Cotillas {

    public static void main(String[] args) {

        int cantidadParticipantes;
        String[] participantes;
        int origenRumor;
        int victimaRumor;
        int destinoRumor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de participantes");
        cantidadParticipantes = scanner.nextInt();
        scanner.nextLine();

        participantes = new String[cantidadParticipantes];

        for (int i = 0; i < cantidadParticipantes; i++) {
            participantes[i] = "Persona Número " + (i + 1);
        }
        origenRumor = (int) (Math.random() * (cantidadParticipantes));

        do {
            victimaRumor = (int) (Math.random() * cantidadParticipantes);
        } while (victimaRumor == origenRumor);

        System.out.println(
                "[" + participantes[origenRumor] + "] se inventa un rumor de [" + participantes[victimaRumor] + "]");

        scanner.next();

        int actual = origenRumor;

        int[] vecesEscuchado = new int[cantidadParticipantes];
        vecesEscuchado[actual]++;

        do {
            do {
                destinoRumor = (int) (Math.random() * cantidadParticipantes);
            } while (destinoRumor == actual || destinoRumor == victimaRumor);

            System.out.println(
                    "[" + participantes[actual] + "] le cuenta el rumor a [" + participantes[destinoRumor] + "]");

            if (vecesEscuchado[destinoRumor] > 0) {
                System.out.println("El rumor llegó a [" + participantes[destinoRumor] + "] por segunda vez.");
                break;
            }

            vecesEscuchado[destinoRumor]++;

            actual = destinoRumor;

            scanner.next();
        } while (actual != origenRumor);

    }

}