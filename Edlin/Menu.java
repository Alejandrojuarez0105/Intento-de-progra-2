import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private Editor editor;

    public Menu(Editor editor) {
        this.editor = editor;
    }

    public void mostrarMenu() {
        System.out.println("Comandos disponibles:");
        System.out.println("[L] Definir línea activa");
        System.out.println("[E] Editar línea activa");
        System.out.println("[I] Intercambiar líneas");
        System.out.println("[B] Borrar contenido de línea activa");
        System.out.println("[S] Salir del programa");
        System.out.print("Seleccione una opción: ");
    }

    public boolean procesarOpcion() {
        char opcion = askChar();
        switch (opcion) {
            case 'L':
            case 'l':
                editor.setActiveLine();
                break;
            case 'E':
            case 'e':
                editor.edit();
                break;
            case 'I':
            case 'i':
                editor.exchangeLines();
                break;
            case 'B':
            case 'b':
                editor.delete();
                break;
            case 'S':
            case 's':
                System.out.println("Saliendo del programa...");
                return false;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
        return true;
    }

    public static char askChar() {
        return scanner.next().charAt(0);
    }

    public static int askInt() {
        return scanner.nextInt();
    }

    public static String askString() {
        scanner.nextLine();
        return scanner.nextLine();
    }
}
