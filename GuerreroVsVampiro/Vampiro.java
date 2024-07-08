class Vampiro {
    private int vida = 10;
    private int ataque = 4;
    private final double PROBABILIDAD_EXITO = 0.50;

    public int vida() {
        return vida;
    }

    public void recibirDaño(int daño) {
        this.vida -= daño;
    }

    public boolean atacar() {
        return Math.random() < PROBABILIDAD_EXITO;
    }

    public int ataque() {
        return ataque;
    }

}
