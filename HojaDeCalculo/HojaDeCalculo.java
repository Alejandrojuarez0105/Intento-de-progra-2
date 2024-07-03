class HojaDeCalculo {

    private Celda[][] celdas;
    private final int NUMERO_COLUMNAS = 10;
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
        if (fila >= 0 && fila < fila && columna >= 0 && columna < columna) {
            celdas[fila][columna].setValor(valor);
        }
    }

    public void mostrarHoja(int filaActual, int columnaActual) {
        for (int i = 0; i < NUMERO_FILAS; i++) {
            System.out.print((0 + 1 + i) + "\t");
            for (int j = 0; j < NUMERO_COLUMNAS; j++) {
                if (i == filaActual && j == columnaActual) {
                    System.out.print("[" + celdas[i][j].getValorFormateado() + "]\t");
                } else {
                    System.out.print("[      ]\t");
                }
            }
            System.out.println();
        }
        System.out.print("\t");
        for (int j = 0; j < NUMERO_COLUMNAS; j++) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

}