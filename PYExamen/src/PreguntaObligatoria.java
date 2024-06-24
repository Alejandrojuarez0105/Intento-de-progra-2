class PreguntaObligatoria extends Pregunta {
    public PreguntaObligatoria(String enunciado) {
        super(enunciado);
    }

    @Override
    public String mostrar() {
        return "[OBLIGATORIA] " + super.mostrar();
    }
}
