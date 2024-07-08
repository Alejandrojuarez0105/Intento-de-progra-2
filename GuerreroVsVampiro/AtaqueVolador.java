class AtaqueVolador extends Ataque {

    public AtaqueVolador() {
        super(20, 0.40);
    }

    @Override
    public String descripcion() {
        return "Mordida: Daño 20, Probabilidad de exito de 40%";
    }

}