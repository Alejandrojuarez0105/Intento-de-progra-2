class Rumor {
    private Participante origen;
    private Participante victima;

    public Rumor(Participante origen, Participante victima) {
        this.origen = origen;
        this.victima = victima;
    }

    public String getInicioMensaje() {
        return "[" + origen.getNombre() + "] se inventa un rumor de [" + victima.getNombre() + "]";
    }

    public String getMensaje(Participante contador, Participante receptor) {
        return "[" + contador.getNombre() + "] le cuenta el rumor a [" + receptor.getNombre() + "]";
    }
}
