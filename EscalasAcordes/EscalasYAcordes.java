import java.util.Scanner;

public class EscalasYAcordes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Con qué nota desea trabajar?");
        String notaElegida = scanner.nextLine();
        System.out.println("¿Mayor o Menor?");
        String escalaElegida = scanner.nextLine();

        Nota nota = new Nota(notaElegida);
        Escala escala;

        if (esMayor(escalaElegida)) {
            escala = new EscalaMayor(nota);
        } else if (esMenor(escalaElegida)) {
            escala = new EscalaMenor(nota);
        } else {
            System.out.println("Escala no reconocida.");
            scanner.close();
            return;
        }

        escala.imprimirEscala();
        Acorde acorde = escala.construirAcordeNatural();
        acorde.imprimirAcorde();

        scanner.close();
    }

    private static boolean esMayor(String escala) {
        return contieneSinCase(escala, "Mayor");
    }

    private static boolean esMenor(String escala) {
        return contieneSinCase(escala, "Menor");
    }

    private static boolean contieneSinCase(String input, String target) {
        return input.toUpperCase().indexOf(target.toUpperCase()) != -1;
    }
}
