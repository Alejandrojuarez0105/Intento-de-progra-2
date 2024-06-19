class PreguntaOpcional extends Pregunta {
    public PreguntaOpcional(String enunciado) {
        super(enunciado);
    }

    @Override
    public String mostrar() {
        return "[OPCIONAL] " + super.mostrar();
    }
}

