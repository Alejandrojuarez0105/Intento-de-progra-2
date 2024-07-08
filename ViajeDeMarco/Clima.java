class Clima {

    private String descripcionClima;
    private boolean llueve;
    private boolean llueveFuerte;
    final private double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
    final private double PROBABILIDAD_LLUVIA = 0.4;

    public void actualizar() {
        double probabilidad = Math.random();

        iniciarLluvia();

        llueveFuerte = probabilidad <= PROBABILIDAD_LLUVIA_FUERTE;
        llueve = probabilidad <= PROBABILIDAD_LLUVIA;

        descripcionClima = "Una " + (llueveFuerte ? " fuerte " : "") + (llueve ? " lluvia " : " mañana soleada");
    }

    private void iniciarLluvia() {
        llueve = false;
        llueveFuerte = false;
    }

    public String estado() {
        return descripcionClima;
    }

    public boolean estaLloviendo() {
        return llueve;
    }

    public boolean estaLloviendoFuerte() {
        return llueveFuerte;
    }
}