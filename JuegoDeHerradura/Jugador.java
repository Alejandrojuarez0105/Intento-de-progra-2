class Jugador {
    private String nombre;
    private int total;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.total = 0;
    }

    public int lanzamiento() {
        int tramo = (int) (Math.random() * 2) + 1;
        int alcance = 0;

        if (tramo == 1 && Math.random() < 0.1) {
            alcance = 5;
        } else if (tramo == 2 && Math.random() < 0.12) {
            alcance = 3;
        } else if (tramo == 3 && Math.random() < 0.78) {
            alcance = 1;
        }

        System.out.println(nombre + "-".repeat(alcance) + "U");
        return alcance;
    }

    public void sumarPuntos(int puntos) {
        total += puntos;
    }

    public int getTotal() {
        return total;
    }
}