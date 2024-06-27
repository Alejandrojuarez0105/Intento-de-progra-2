public class Esclavo {
    private String nombre;
    private int edad;
    private String equipo;
    private Horas horasTrabajadas;

    public Esclavo(String nombre, int edad, String equipo, Horas horasTrabajadas) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.horasTrabajadas = horasTrabajadas;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Equipo: " + equipo
                + ", Las horas se distribuyen de la siguiente manera: ");
        horasTrabajadas.mostrar();
    }

}
