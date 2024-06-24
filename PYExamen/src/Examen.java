class Examen {
    private String nombre;
    private Profesor vigilante;
    private Pregunta[] preguntas;
    private int contadorPregunta;

    public Examen(String nombre) {
        this.nombre = nombre;
        this.preguntas = new Pregunta[5];
        this.contadorPregunta = 0;
    }

    public void asociarPregunta(Pregunta pregunta) {
        if (contadorPregunta < preguntas.length) {
            this.preguntas[contadorPregunta] = pregunta;
            this.contadorPregunta++;
        } else {
            System.out.println("No se pueden agregar más preguntas, límite alcanzado.");
        }
    }

    public void asociarProfesorVigilante(Profesor vigilante) {
        this.vigilante = vigilante;
    }

    public String mostrarExamen() {
        String resultado = nombre + " vigilado por " + vigilante.mostrarNombre() + "\n";

        for (int i = 0; i < contadorPregunta; i++) {
            resultado += "- Pregunta " + (i + 1) + ": " + preguntas[i].mostrar() + "\n";
        }

        return resultado;
    }
}
