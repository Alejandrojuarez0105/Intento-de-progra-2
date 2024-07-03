public class Celda {
    private String valor;

    public Celda() {
        this.valor = "";
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValorFormateado() {
        if (valor.length() > 0) {
            return valor.substring(0, Math.min(valor.length(), 6));
        } else {
            return "      ";
        }
    }

}