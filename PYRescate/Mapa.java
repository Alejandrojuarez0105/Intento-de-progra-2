public class Mapa {

    private Casilla[][] casillas;
    private static int filas;
    private static int columnas;

    public Mapa(int numeroFilas, int numeroColumnas) {
        Mapa.filas = numeroFilas;
        Mapa.columnas = numeroColumnas;
        casillas = new Casilla[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                casillas[i][j] = new Casilla();
            }
        }
    }

    public void caen(Soldado soldado) {
        int fila;
        int columna;
        do {
            fila = (int) (Math.random() * filas);
            columna = (int) (Math.random() * columnas);
        } while (casillas[fila][columna].obtenerSoldado() != null);
        casillas[fila][columna].colocarSoldado(soldado);
    }

    public void imprimir() {
        System.out.println("+-a-b-c-d-e-f-g-h-");
        for (int i = 0; i < filas; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < columnas; j++) {
                System.out.print(casillas[i][j].obtenerSimbolo() + " ");
            }
            System.out.println();
        }
        System.out.println("+-----------------");
        System.out.println("------------------------------------");

    }

    public boolean rescatarSoldado(int fila, int columna) {

        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas
                && casillas[fila][columna].tieneSoldado()) {
            casillas[fila][columna].obtenerSoldado().rescatar();
            casillas[fila][columna].revelar();
            casillas[fila][columna].removerSoldado();
            return true;
        }
        return false;

    }

    public void imprimirFinal() {
        System.out.println("+-a-b-c-d-e-f-g-h-");
        for (int i = 0; i < filas; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < columnas; j++) {
                if (casillas[i][j].tieneSoldado()) {
                    System.out.print("S ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println("+-----------------");
    }
}
