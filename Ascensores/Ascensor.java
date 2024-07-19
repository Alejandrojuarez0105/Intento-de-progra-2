public class Ascensor {
    public static final int PARADO = 0;
    public static final int SUBIENDO = 1;
    public static final int BAJANDO = 2;

    private int capacidadMaxima;
    private Persona[] personasDentro;
    private int cantidadPersonas;
    private int plantaActual;
    private int estado;

    public Ascensor(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.personasDentro = new Persona[capacidadMaxima];
        this.cantidadPersonas = 0;
        this.plantaActual = 0;
        this.estado = PARADO;
    }

    public void subir() {
        plantaActual++;
        estado = SUBIENDO;
    }

    public void bajar() {
        plantaActual--;
        estado = BAJANDO;
    }

    public boolean cargarPersona(Persona persona) {
        if (cantidadPersonas < capacidadMaxima) {
            personasDentro[cantidadPersonas] = persona;
            cantidadPersonas++;
            return true;
        }
        return false;
    }

    public Persona[] descargarPersonas() {
        Persona[] personasBajadas = new Persona[cantidadPersonas];
        int idx = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if (personasDentro[i].getDestino() == plantaActual) {
                personasBajadas[idx] = personasDentro[i];
                idx++;
            }
        }

        Persona[] nuevasPersonasDentro = new Persona[capacidadMaxima];
        int nuevoIndice = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if (personasDentro[i].getDestino() != plantaActual) {
                nuevasPersonasDentro[nuevoIndice] = personasDentro[i];
                nuevoIndice++;
            }
        }
        personasDentro = nuevasPersonasDentro;
        cantidadPersonas = nuevoIndice;
        return personasBajadas;
    }

    public boolean hayEspacioParaSubir(int cantidad) {
        return cantidadPersonas + cantidad <= capacidadMaxima;
    }

    public int getPlantaActual() {
        return plantaActual;
    }

    public int getEstado() {
        return estado;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public Persona[] getPersonasDentro() {
        return personasDentro;
    }
}
