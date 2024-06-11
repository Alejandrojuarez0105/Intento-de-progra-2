public class Becario {

    private Profesor profesorActual;
    private int problemasFaltantes;
    private String nombre;

    public Becario(String nombre) {
        this.nombre = nombre;
        this.profesorActual = null;

    }

    public void recibe(Profesor profesor) {
        if (profesor != null) {
            this.profesorActual = profesor;
            this.problemasFaltantes = profesor.getProblemas();
        }
    }

    public boolean estaLibre() {
        return profesorActual == null;
    }

    public void ayudan() {
        if (profesorActual != null) {
            problemasFaltantes--;
            if (problemasFaltantes <= 0) {
                profesorActual = null;
            }
        }
    }

    public void verEstado() {
        if (estaLibre()) {
            System.out.println(nombre + " esta libre");
        } else {
            System.out.println(nombre + " está ayudando a un profesor con " + problemasFaltantes + " problemas");
        }
    }

    public String getNombre() {
            return nombre;
    }

}
