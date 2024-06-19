class PreguntaExtra extends Pregunta {
    public PreguntaExtra(String enunciado) {
        super(enunciado);
    }

    @Override
    public String mostrar() {
        return "[EXTRA] " + super.mostrar();
    }
}

