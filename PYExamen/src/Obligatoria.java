class Obligatoria extends Pregunta {
    public Obligatoria(String enunciado) {
        super(enunciado);
    }

    @Override
    public String mostrar() {
        return "[OBLIGATORIA] " + super.mostrar();
    }
}
