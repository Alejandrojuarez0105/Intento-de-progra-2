import java.util.Scanner;

public class JuegoPacman {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        Pacman pacman = new Pacman(3, 5);

        Scanner scanner = new Scanner(System.in);
        boolean terminado = false;

        while (!terminado) {
            mapa.mostrarMapa(pacman);
            String movimiento = scanner.nextLine().toUpperCase();

            if (movimiento.length() == 1 && "WASD".contains(movimiento)) {
                pacman.mover(movimiento, mapa);
            } else {
                System.out.println("Movimiento no válido.");
            }
        }

        System.out.println("Juego cerrado.");
        scanner.close();
    }
}
