
public class Tablero {

    private char[][] casillas;

    public Tablero() {
        casillas = new char[3][3];
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = '-';
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                System.out.print(" " + casillas[i][j]);
            }
            System.out.println();
        }

    }

    public boolean hayTresEnRaya() {
        return hayTresEnRaya('o') || hayTresEnRaya('x');
    }

    private boolean hayTresEnRaya(char ficha) {
        int[] filas = new int[3];
        int[] columnas = new int[3];
        int diagonal = 0;
        int inversa = 0;
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (ficha == casillas[i][j]) {
                    filas[i]++;
                    columnas[j]++;
                    diagonal = diagonal + ((i == j) ? 1 : 0);
                    inversa = inversa + ((i + j == 2) ? 1 : 0);
                    if (filas[i] == 3 || columnas[j] == 3 || diagonal == 3 || inversa == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean estaCompleto(Jugador jugador) {
        char ficha = jugador.ficha();
        int conteoFichas = 0;
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (casillas[i][j] == ficha) {
                    conteoFichas++;
                }
            }
        }
        return conteoFichas == 3;
    }

    public boolean ocupado(Coordenada coordenada) {
        return casillas[coordenada.getFila() - 1][coordenada.getColumna() - 1] != '-';
    }

    public void ponerFicha(Coordenada coordenada, char ficha) {
        casillas[coordenada.getFila() - 1][coordenada.getColumna() - 1] = ficha;
    }

    public void sacarFicha(Coordenada coordenada) {
        casillas[coordenada.getFila() - 1][coordenada.getColumna() - 1] = '-';
    }
}
