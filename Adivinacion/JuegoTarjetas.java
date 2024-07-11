import java.util.Scanner;

class JuegoTarjetas {
    private Scanner scanner = new Scanner(System.in);

    public void simular() {
        Tarjeta[] tarjetas = new Tarjeta[7];
        tarjetas[0] = new TarjetaUno();
        tarjetas[1] = new TarjetaDos();
        tarjetas[2] = new TarjetaTres();
        tarjetas[3] = new TarjetaCuatro();
        tarjetas[4] = new TarjetaCinco();
        tarjetas[5] = new TarjetaSeis();
        tarjetas[6] = new TarjetaSiete();

        int numeroPorAdivinar = 0;

        for (int i = 0; i < tarjetas.length; i++) {
            numeroPorAdivinar += tarjetas[i].interrogarTarjeta(scanner);
        }

        System.out.println("El número pensado era " + numeroPorAdivinar);
    }
}