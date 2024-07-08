class Espada extends Arma {

    public Espada() {
        super(15, 0.25);
    }

    @Override
    public String descripcion() {
        return "Espada: Daño 15, Probabilidad de exito de 25%";
    }

}