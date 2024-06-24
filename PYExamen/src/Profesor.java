class Profesor extends Persona {
    private Asignatura asignatura;

    public Profesor(String nombre) {
        super(nombre, "");
    }

    public Profesor(String nombre, String dni) {
        super(nombre, dni);
    }

    public void asociarAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public void mostrar() {
        System.out.println(getNombre() + " imparte " + asignatura.mostrar());
        if (asignatura.getExamen() != null) {
            System.out.println(asignatura.getExamen().mostrarExamen());
        }
    }

}
