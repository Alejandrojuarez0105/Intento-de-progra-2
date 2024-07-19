import java.util.Scanner;

class Menu {
    private SistemaReservas sistemaReservas;
    private Scanner entrada;

    public Menu(SistemaReservas sistemaReservas) {
        this.sistemaReservas = sistemaReservas;
        this.entrada = new Scanner(System.in);
    }

    public void mostrarMenu() {
        boolean salirSistema = false;

        while (!salirSistema) {
            System.out.println("-------------------------------------------------");
            System.out.println("1 - Listar aulas");
            System.out.println("2 - Reservar un aula");
            System.out.println("3 - Liberar un aula");
            System.out.println("4 - Salir del sistema");
            System.out.println("-------------------------------------------------");
            System.out.println("Ingrese una opción:");

            int opcionElegida = entrada.nextInt();
            entrada.nextLine();

            switch (opcionElegida) {
                case 1:
                    sistemaReservas.listarAulas();
                    break;
                case 2:
                    sistemaReservas.reservarAula(entrada);
                    break;
                case 3:
                    sistemaReservas.liberarAula(entrada);
                    break;
                case 4:
                    System.out.println("Gracias por usar el Sistema de reservas de aulas");
                    salirSistema = true;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        }
    }
}