class Tablero {
    private static final String MONIGOTE = "('')";
    private static final String MARTILLO = "[[]]";
    private static final String VACIO = "(  )";
    private static final String GOLPE = "['']";

    public void imprimir(int golpe, int monigote, int turnos, int aciertos) {
        String queImprimir;

        System.out.println("Golpe en [" + golpe + "] / Monigote en [" + monigote + "]");

        for (int fila = 1; fila <= 4; fila++) {
            for (int columna = 1; columna <= 4; columna++) {
                int posicion = columna + 4 * (fila - 1);

                queImprimir = VACIO;
                if (posicion == golpe && golpe == monigote) {
                    queImprimir = GOLPE;
                } else if (posicion == golpe) {
                    queImprimir = MARTILLO;
                } else if (posicion == monigote) {
                    queImprimir = MONIGOTE;
                }
                System.out.print(queImprimir);
            }
            System.out.println();
        }

        System.out.println("Turno: " + turnos + " / Aciertos: " + aciertos);
    }
}