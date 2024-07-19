class Coches extends Extras {
    public Coches() {
        super();
    }

    @Override
    public void aplicarEfecto(Caracol caracol) {
        double probabilidaddeChoque = Math.random();
        if (probabilidaddeChoque <= 0.35) {
            caracol.mover(0, 2);
            System.out.println("El caracol fue golpeado por un coche y bajó 2 metros.");
        }
    }
}