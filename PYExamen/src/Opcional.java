class Opcional extends Pregunta {
    public Opcional(String enunciado) {
        super(enunciado);
    }

    @Override
    public String mostrar() {
        return "[OPCIONAL] " + super.mostrar();
    }
}
