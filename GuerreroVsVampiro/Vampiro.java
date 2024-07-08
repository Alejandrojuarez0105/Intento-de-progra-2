class Vampiro {
    private int vida = 60;
    private Ataque[] ataques;

    public Vampiro(){
        ataques = new Ataque[]{new Mordida(), new Garra(), new AtaqueVolador()};
    }

    public int vida() {
        return vida;
    }

    public void recibirDaño(int daño) {
        this.vida -= daño;
    }

    public boolean atacar() {
        return ataques[(int) (Math.random() * ataques.length)].atacar();
    }

    public int ataque() {
        return ataques[(int) (Math.random() * ataques.length)].getDaño();
    }

    public int dañoCausado() {
        if (atacar()) {
            return ataque();
        } else {
            return 0;
        }
    }

}
