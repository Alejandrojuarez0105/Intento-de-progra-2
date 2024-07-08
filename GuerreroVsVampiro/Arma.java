abstract class Arma {

    protected int daño;
    protected double probabilidadExito;

    public Arma(int daño, double probabilidadExito) {
        this.daño = daño;
        this.probabilidadExito = probabilidadExito;
    }

    public int getDaño() {
        return daño;
    }

    public boolean atacar() {
        return Math.random() < probabilidadExito;
    }

    public abstract String descripcion();

}