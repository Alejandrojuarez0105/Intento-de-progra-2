import java.util.Scanner;

public class Menu {
    private static final int CONFIGURACION = 1;
    private static final int EJECUCION_DEL_TEST = 2;
    private static final int SALIR_DEL_SISTEMA = 3;

    private int primerFactor;
    private int dificultad;
    private boolean funcionando;
    private Scanner scanner;

    public Menu() {
        this.primerFactor = 0;
        this.dificultad = 0;
        this.funcionando = true;
        this.scanner = new Scanner(System.in);
    }

    public void mostrar() {
        while (funcionando) {
            imprimirMenuPrincipal();
            int seleccionMenu = scanner.nextInt();

            switch (seleccionMenu) {
                case CONFIGURACION:
                    configurar();
                    break;
                case EJECUCION_DEL_TEST:
                    if (primerFactor != 0) {
                        iniciarTest();
                    } else {
                        System.out.println("Primero configure el valor y la dificultad.");
                    }
                    break;
                case SALIR_DEL_SISTEMA:
                    funcionando = false;
                    break;
                default:
                    System.out.println("Selección no válida. Intente de nuevo.");
            }
        }
        System.out.println("Hasta luego!");
    }

    private void imprimirMenuPrincipal() {
        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("1. Configuración");
        System.out.println("2. Ejecución del Test");
        System.out.println("3. Salir del sistema");
    }

    private void configurar() {
        this.primerFactor = preguntarEntero(2, 10, "Dime un valor entre 2 y 10");
        this.dificultad = preguntarEntero(1, 3, "Dime la dificultad (1: fácil / 2: normal / 3: difícil):");
    }

    private int preguntarEntero(int valorMinimo, int valorMaximo, String mensaje) {
        int valor;
        do {
            System.out.println("=".repeat(mensaje.length()));
            System.out.println(mensaje);
            System.out.println("=".repeat(mensaje.length()));
            valor = scanner.nextInt();
        } while (!(valor >= valorMinimo && valor <= valorMaximo));
        return valor;
    }

    private void iniciarTest() {
        Test test = new Test(primerFactor, dificultad, scanner);
        test.ejecutar();
    }
}
