class Mono {

    private String descripcionAmedio;
    private boolean escapa;
    private boolean estaCansado;
    private final double AMEDIO_ESCAPA = 0.15;
    private final double AMEDIO_CANSADO = 0.25;

    public void actualizar() {
        iniciarMono();

        estaCansado = Math.random() <= AMEDIO_CANSADO;
        escapa = Math.random() <= AMEDIO_ESCAPA;

        descripcionAmedio = (estaCansado ? "Se cansó " : "No se cansó ") + (escapa ? "Se escapó" : "No se escapó");
    }

    private void iniciarMono() {
        descripcionAmedio = "";
        escapa = false;
        estaCansado = false;
    }

    public String estado() {
        return descripcionAmedio;
    }

    public boolean escapa() {
        return escapa;
    }

    public boolean estaCansado() {
        return estaCansado;
    }
}