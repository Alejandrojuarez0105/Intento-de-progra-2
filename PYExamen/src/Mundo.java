public class Mundo {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Manuel");

        Asignatura programacion = new Asignatura("Programacion 2", "PRG2", 6);

        Examen examen = new Examen("Examen parcial");

        examen.asociarPregunta(new PreguntaObligatoria("¿Qué es la herencia en programación orientada a objetos?"));
        examen.asociarPregunta(new PreguntaOpcional("Enumera tres beneficios del polimorfismo."));
        examen.asociarPregunta(new PreguntaExtra("Diferencia entre overloading y overriding en Java."));
        examen.asociarPregunta(new PreguntaObligatoria("Explica el concepto de encapsulamiento."));
        examen.asociarPregunta(new PreguntaOpcional("Menciona dos ejemplos de uso de interfaces en Java."));

        Profesor vigilante = new Profesor("Loyda", "XXX666999");

        examen.asociarProfesorVigilante(vigilante);
        programacion.asociarExamen(examen);
        profesor.asociarAsignatura(programacion);

        profesor.mostrar();
    }
}