
public class Estadisticas {

    private int soldadosRescatados;

    public Estadisticas() {
        soldadosRescatados = 0;
    }

    public void registrarRescate() {
        soldadosRescatados++;
    }

    public int getSoldadosRescatados() {
        return soldadosRescatados;
    }

    public void soldadosRescatados() {
        System.out.println("Soldados rescatados: " + soldadosRescatados);
    }

    public void mostrar() {
        System.out.println("Soldados totales rescatados: " + soldadosRescatados);
    }
}
