class Aula {
    private int numero;
    private boolean libre;
    private String alumnoResponsable;
    private String alumnosAsistentes;

    public Aula(int numero) {
        this.numero = numero;
        this.libre = true;
        this.alumnoResponsable = "";
        this.alumnosAsistentes = "";
    }

    public boolean estaLibre() {
        return libre;
    }

    public void reservar(String alumnoResponsable, String alumnosAsistentes) {
        this.libre = false;
        this.alumnoResponsable = alumnoResponsable;
        this.alumnosAsistentes = alumnosAsistentes;
    }

    public void liberar() {
        this.libre = true;
        this.alumnoResponsable = "";
        this.alumnosAsistentes = "";
    }

    public void mostrarEstado() {
        String estado = libre ? "Libre" : "Ocupada";
        System.out.println("Aula " + numero + ": " + estado + " - " + alumnoResponsable);
    }
}