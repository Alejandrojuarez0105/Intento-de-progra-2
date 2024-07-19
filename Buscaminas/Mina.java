class Mina {
    private boolean descubierta;
    private boolean esMina;
    private int minasAdyacentes;

    public Mina() {
        this.descubierta = false;
        this.esMina = false;
        this.minasAdyacentes = 0;
    }

    public boolean esDescubierta() {
        return descubierta;
    }

    public void descubrir() {
        this.descubierta = true;
    }

    public boolean esMina() {
        return esMina;
    }

    public void colocarMina() {
        this.esMina = true;
    }

    public int getMinasAdyacentes() {
        return minasAdyacentes;
    }

    public void incrementarMinasAdyacentes() {
        this.minasAdyacentes++;
    }
}