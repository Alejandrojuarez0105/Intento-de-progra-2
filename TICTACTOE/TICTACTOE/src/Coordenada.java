import java.util.Scanner;

public class Coordenada {

    private int fila;
    private int columna;

    public void recoger() {
        do {
            System.out.println("Dame una fila [1..3]");
            fila = new Scanner(System.in).nextInt();
            System.out.println("Dame una columna [1..3] ");
            columna = new Scanner(System.in).nextInt();
        } while (!valida());
    }

    public boolean valida() {
        return fila >= 1 && fila <= 3 && columna >= 1 && columna <= 3;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

}
