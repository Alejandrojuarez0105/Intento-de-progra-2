class Mensaje {
    private String texto;

    public Mensaje(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void alterarMensaje() {
        texto = texto + "X";
    }
}