
public class Soldado {
    private boolean rescatado;

    public Soldado() {
        this.rescatado = false;
    }

    public boolean isRescatado() {
        return rescatado;
    }

    public void rescatar() {
        this.rescatado = true;
    }
}
