
public class Jugador {

    private char ficha;

    public Jugador(char ficha) {
        this.ficha = ficha;
    }

    public char ficha() {
        return ficha;
    }

    public void celebrar() {
        System.out.println("Los " + ficha + " han ganado!!!!");
    }

    public void ponerFicha(Tablero tablero) {
        Coordenada coordenada = new Coordenada();
        do {
            coordenada.recoger();
        } while (!coordenada.valida() || tablero.ocupado(coordenada));

        tablero.ponerFicha(coordenada, ficha);
    }

    public void moverFicha(Tablero tablero) {
        Coordenada coordenada = new Coordenada();
        do {
            coordenada.recoger();
        } while (!coordenada.valida() || !tablero.ocupado(coordenada));
        tablero.sacarFicha(coordenada);
        ponerFicha(tablero);
    }

}
