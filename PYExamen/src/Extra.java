class Extra extends Pregunta {
    public Extra(String enunciado) {
        super(enunciado);
    }

    @Override
    public String mostrar() {
        return "[EXTRA] " + super.mostrar();
    }
}