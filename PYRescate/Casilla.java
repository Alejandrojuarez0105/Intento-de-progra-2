public class Casilla {
    private Soldado soldado;
    private boolean revelada;
    private boolean haySoldado;

    public Casilla() {
        this.revelada = false;
        this.haySoldado = false;
    }

    public void colocarSoldado(Soldado soldado) {
        this.soldado = soldado;
        this.haySoldado = true;
    }

    public Soldado obtenerSoldado() {
        return soldado;
    }

    public void removerSoldado() {
        this.soldado = null;
        this.haySoldado = false;
    }

    public boolean tieneSoldado() {
        return haySoldado;
    }

    public void revelar() {
        this.revelada = true;
    }

    String iconoInicio = " ";

    public String obtenerSimbolo() {
        if (!tieneSoldado()) {
            iconoInicio = "S";
        }

        if (tieneSoldado()) {
            iconoInicio = "~";
        }
        if (!revelada) {
            iconoInicio = ".";
        }

        return iconoInicio;
    }

}
