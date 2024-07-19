public class Coordenadas {
    private int x;
    private int y;

    public Coordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moverArriba() {
        this.y--;
    }

    public void moverAbajo() {
        this.y++;
    }

    public void moverIzquierda() {
        this.x--;
    }

    public void moverDerecha() {
        this.x++;
    }
}
