class Camello {
    private static final String CAMELLO = ";--;'";
    private String nombre;
    private int posicion;
    private int ultimoAvance;

    public Camello(String nombre) {
        this.nombre = nombre;
        this.posicion = 0;
        this.ultimoAvance = 0;
    }

    public int avanzar(int opcionUsuario) {
        double probabilidadUsuario = Math.random();
        ultimoAvance = 0;

        if (opcionUsuario == 1 && probabilidadUsuario <= 0.6) {
            ultimoAvance = 1;
        }
        if (opcionUsuario == 2 && probabilidadUsuario <= 0.4) {
            ultimoAvance = 2;
        }
        if (opcionUsuario == 3 && probabilidadUsuario <= 0.3) {
            ultimoAvance = 4;
        }
        if (opcionUsuario == 4 && probabilidadUsuario <= 0.1) {
            ultimoAvance = 6;
        }

        posicion += ultimoAvance;
        return ultimoAvance;
    }

    public boolean tropieza() {
        double probabilidadTropiezo = Math.random();
        return probabilidadTropiezo <= 0.1;
    }

    public void avanzarTurnosExtra(int turnos) {
        for (int i = 0; i < turnos; i++) {
            avanzar();
        }
    }

    public void avanzar() {
        int avanceOrdenador = (int) (Math.random() * 3 + 1);
        posicion += avanceOrdenador;
    }

    public void resetearPosicion() {
        posicion = 0;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getUltimoAvance() {
        return ultimoAvance;
    }

    public void imprimirCamello() {
        System.out.print("[" + nombre.charAt(0) + "]| ");
        for (int i = 0; i < posicion; i++) {
            System.out.print(" ");
        }
        System.out.println(CAMELLO);
    }
}