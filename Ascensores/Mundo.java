public class Mundo {
    private Universidad universidad;

    public Mundo(int cantidadAscensores) {
        this.universidad = new Universidad(cantidadAscensores);
    }

    public void simular(int tiempo) {
        Persona persona1 = new Persona(3, 5);
        Persona persona2 = new Persona(-2, 3);
        universidad.llegarPersona(persona1);
        universidad.llegarPersona(persona2);

        for (int i = 0; i < tiempo; i++) {
            universidad.moverAscensores();
        }

        universidad.visualizarEstado();
    }

    public static void main(String[] args) {
        Mundo mundo = new Mundo(1);
        mundo.simular(10);
    }
}
