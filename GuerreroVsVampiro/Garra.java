class Garra extends Ataque {

    public Garra() {
        super(10, 0.60);
    }

    @Override
    public String descripcion() {
        return "Garra: Daño 10, Probabilidad de exito de 60%";
    }

}