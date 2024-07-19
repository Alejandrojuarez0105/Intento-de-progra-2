public class Pacman {
    private Coordenadas posicion;

    public Pacman(int x, int y) {
        this.posicion = new Coordenadas(x, y);
    }

    public Coordenadas getPosicion() {
        return posicion;
    }

    public void mover(String movimiento, Mapa mapa) {
        switch (movimiento) {
            case "W":
                if (!mapa.esPared(posicion.getY() - 1, posicion.getX())) {
                    posicion.moverArriba();
                }
                break;
            case "A":
                if (!mapa.esPared(posicion.getY(), posicion.getX() - 1)) {
                    posicion.moverIzquierda();
                }
                break;
            case "S":
                if (!mapa.esPared(posicion.getY() + 1, posicion.getX())) {
                    posicion.moverAbajo();
                }
                break;
            case "D":
                if (!mapa.esPared(posicion.getY(), posicion.getX() + 1)) {
                    posicion.moverDerecha();
                }
                break;
            default:
                System.out.println("Este movimiento no es posible.");
        }
    }
}
