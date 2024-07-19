class Clima extends Extras {
    public Clima() {
        super();
    }

    @Override
    public void aplicarEfecto(Caracol caracol) {
        if (caracol.getContador() <= 10) {
            caracol.mover(0, 1);
            System.out.println("El clima es adverso y el caracol baja un metro.");
        }
    }
}