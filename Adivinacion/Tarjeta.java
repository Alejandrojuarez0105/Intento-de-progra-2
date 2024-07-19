import java.util.Scanner;

abstract class Tarjeta {
    protected String preguntaBase;

    public Tarjeta(String preguntaBase) {
        this.preguntaBase = preguntaBase;
    }

    public abstract int getValorTarjeta();

    public int interrogarTarjeta(Scanner scanner) {
        System.out.print(preguntaBase);
        int respuesta = scanner.nextInt();
        return (respuesta == 1) ? this.getValorTarjeta() : 0;
    }
}