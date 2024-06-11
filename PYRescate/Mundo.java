public class Mundo {
    private static final int FILAS = 9;
    private static final int COLUMNAS = 9;

    public static void main(String[] args) {
        Mapa mapa = new Mapa(FILAS, COLUMNAS);
        Jugador jugador = new Jugador(mapa);
        jugador.jugar();
    }

}