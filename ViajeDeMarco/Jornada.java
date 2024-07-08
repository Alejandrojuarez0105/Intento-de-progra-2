import java.util.Scanner;

class Jornada {

    private final double DISTANCIA_INICIAL;
    private final double AVANCE_MADRE_POR_DIA = 80;
    private double distanciaFaltante;
    private int dias;
    private boolean enJornada;

    private Madre madre;
    private Clima clima;
    private Mono amedio;
    private Niño marco;

    public Jornada(int distanciaInicial) {
        DISTANCIA_INICIAL = distanciaInicial;
        enJornada = this.DISTANCIA_INICIAL > 0;
        distanciaFaltante = DISTANCIA_INICIAL;
        dias = 0;
        madre = new Madre(AVANCE_MADRE_POR_DIA);
        clima = new Clima();
        amedio = new Mono();
        marco = new Niño();
    }

    public void iniciar() {
        while (enJornada) {
            dias++;
            clima.actualizar();
            amedio.actualizar();
            marco.actualizar(clima, amedio);
            distanciaFaltante = distanciaFaltante - marco.avanzar() + madre.avanzar();
            enJornada = distanciaFaltante >= 0;
            resumenDelDia();
        }
    }

    private void resumenDelDia() {
        System.out.println("Día " + dias);
        System.out.println(clima.estado());
        System.out.println("El mono " + amedio.estado());
        System.out.println("Marco avanzó " + (int) marco.avanzar());
        System.out.println("Mamá avanzó " + (int) madre.avanzar());
        System.out.println("Queda " + (int) distanciaFaltante);
        System.out.println("=".repeat(30));
        new Scanner(System.in).nextLine();
    }
}