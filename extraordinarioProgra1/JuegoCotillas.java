import java.util.Scanner;

class JuegoCotillas {
    private int cantidadParticipantes;
    private Participante[] participantes;
    private int origenRumor;
    private int victimaRumor;
    private Rumor rumor;
    private Scanner scanner;

    public JuegoCotillas() {
        scanner = new Scanner(System.in);
    }

    public void jugar() {
        obtenerCantidadParticipantes();
        crearParticipantes();
        iniciarRumor();
        pasarRumor();
    }

    private void obtenerCantidadParticipantes() {
        System.out.println("Ingrese el número de participantes:");
        cantidadParticipantes = scanner.nextInt();
        scanner.nextLine();
    }

    private void crearParticipantes() {
        participantes = new Participante[cantidadParticipantes];
        for (int i = 0; i < cantidadParticipantes; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            participantes[i] = new Participante(nombre);
        }
    }

    private void iniciarRumor() {
        origenRumor = (int) (Math.random() * cantidadParticipantes);
        do {
            victimaRumor = (int) (Math.random() * cantidadParticipantes);
        } while (victimaRumor == origenRumor);

        rumor = new Rumor(participantes[origenRumor], participantes[victimaRumor]);
        System.out.println(rumor.getInicioMensaje());
        scanner.next();
    }

    private void pasarRumor() {
        int actual = origenRumor;
        int[] vecesEscuchado = new int[cantidadParticipantes];
        vecesEscuchado[actual]++;

        do {
            int destinoRumor;
            do {
                destinoRumor = (int) (Math.random() * cantidadParticipantes);
            } while (destinoRumor == actual || destinoRumor == victimaRumor);

            System.out.println(rumor.getMensaje(participantes[actual], participantes[destinoRumor]));

            if (vecesEscuchado[destinoRumor] > 0) {
                System.out
                        .println("El rumor llegó a [" + participantes[destinoRumor].getNombre() + "] por segunda vez.");
                break;
            }

            vecesEscuchado[destinoRumor]++;
            actual = destinoRumor;
            scanner.next();
        } while (actual != origenRumor);
    }
}