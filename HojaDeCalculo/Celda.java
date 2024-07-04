public class Celda {
    private String valor;

    public Celda() {
        this.valor = "";
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }

    public String getValorFormateado() {
        if (valor.length() > 4) {
            return valor.substring(0, 4);
        } else {
            StringBuilder valorFormateado = new StringBuilder(valor);
            while (valorFormateado.length() < 4) {
                valorFormateado.append(' ');
            }
            return valorFormateado.toString();
        }
    }

}