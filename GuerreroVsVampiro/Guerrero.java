class Guerrero {

    private int vida = 150;
    private Arma[] armas;
    private int armaSeleccionada = 0;

    public Guerrero() {
        armas = new Arma[] { new Hacha(), new Espada(), new Latigo() };
    }

    public int vida() {
        return vida;
    }

    public void recibirDaño(int daño) {
        this.vida -= daño;
    }

    public boolean atacar() {
        return armas[armaSeleccionada].atacar();
    }

    public int ataque() {
        return armas[armaSeleccionada].getDaño();
    }

    public void seleccionarArma(int indice) {
        if (indice >= 0 && indice < armas.length) {
            armaSeleccionada = indice;
        }
    }

    public int dañoCausado() {
        if (atacar()) {
            return ataque();
        } else {
            return 0;
        }
    }

}
