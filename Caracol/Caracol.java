class Caracol {
    private double altura;
    private boolean vida;
    private int contador;

    public Caracol(double caida) {
        this.altura = -caida;
        this.vida = true;
        this.contador = 0;
    }

    public double getAltura() {
        return altura;
    }

    public boolean estaVivo() {
        return vida;
    }

    public int getContador() {
        return contador;
    }

    public void mover(int subida, int bajada) {
        this.altura += subida - bajada;
        this.contador++;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }
}