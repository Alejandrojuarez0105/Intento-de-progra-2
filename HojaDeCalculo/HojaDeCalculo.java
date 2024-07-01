class HojaDeCalculo {

    private Celda[][] celdas;
    final int NUMERO_COLUMNAS = 10;
    final int NUMERO_FILAS = 15;

    public HojaDeCalculo(){
        celdas = new Celda[NUMERO_FILAS][NUMERO_COLUMNAS];
        for(int i = 0; i < NUMERO_FILAS; i++){
            for (int j = 0; j < NUMERO_COLUMNAS; j++){
                    celdas[i][j] = new Celda();
            }
        }
    }

}