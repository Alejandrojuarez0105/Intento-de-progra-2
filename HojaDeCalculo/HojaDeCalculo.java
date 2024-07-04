class HojaDeCalculo {

    private Celda[][] celdas;
    private final int NUMERO_COLUMNAS = 8;
    private final int NUMERO_FILAS = 15;

    public HojaDeCalculo() {
        celdas = new Celda[NUMERO_FILAS][NUMERO_COLUMNAS];
        for (int i = 0; i < NUMERO_FILAS; i++) {
            for (int j = 0; j < NUMERO_COLUMNAS; j++) {
                celdas[i][j] = new Celda();
            }
        }
    }

    public int getFilas() {
        return NUMERO_FILAS;
    }

    public int getColumnas() {
        return NUMERO_COLUMNAS;
    }

    public Celda getCelda(int fila, int columna) {
        if (fila >= 0 && fila < NUMERO_FILAS && columna >= 0 && columna < NUMERO_COLUMNAS) {
            return celdas[fila][columna];
        }
        return null;
    }

    public void setCeldaValor(int fila, int columna, String valor) {
        if (fila >= 0 && fila < NUMERO_FILAS && columna >= 0 && columna < NUMERO_COLUMNAS) {
            celdas[fila][columna].setValor(valor);
        }
    }

    public void mostrarHoja(int filaActual, int columnaActual) {
        System.out.println("----+".repeat(11));
        System.out.println("    | A  | B  | C  | D  | E  | F  | G  | H  | I  | J  |");
        System.out.println("----+".repeat(11));

        for (int i = 0; i < NUMERO_FILAS; i++) {
            System.out.print((NUMERO_FILAS - i) + "\t");
            for (int j = 0; j < NUMERO_COLUMNAS; j++) {
                if (i == filaActual && j == columnaActual) {
                    System.out.print("|[" + celdas[i][j].getValorFormateado() + "]");
                } else {
                    System.out.print("| " + celdas[i][j].getValorFormateado() + "");
                }
            }
            System.out.println("|");
            System.out.println("----+".repeat(11));
        }
      
    }

}