
public class Asignatura {

    private String nombre;
    private Examen examen;
    private int creditos;
    private String abreviatura;

    public Asignatura(String nombre, String abreviatura, int creditos) {
        this.abreviatura = abreviatura;
        this.creditos = creditos;
        this.nombre = nombre;
    }

    public void asociarExamen(Examen examen) {
        this.examen = examen;
    }

    public Examen getExamen() {
        return this.examen;
    }

    public String mostrar() {
        return this.nombre + " (" + this.abreviatura + "," + this.creditos + ")";
    }

}
