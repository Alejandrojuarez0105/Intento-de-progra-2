class Mordida extends Ataque {

    public Mordida() {
        super(5, 0.90);
    }

    @Override
    public String descripcion() {
        return "Mordida: Daño 5, Probabilidad de exito de 90%";
    }

}