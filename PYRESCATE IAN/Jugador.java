import java.util.Scanner;

public class Jugador {
  private static int CoordenadaX;
  private static int CoordenadaY;
  private static int cantidadSoldados;
  private static int cantidaSoldadosRescatados;
  private static boolean gano;

  public static void Jugar(int[][] mapa) {

    System.out.println("Por favor, ingrese la coordenada para rescatar un soldado");
    System.out.print("Fila: ");
    Scanner scanner = new Scanner(System.in);

    int fila = scanner.nextInt() - 1;
    System.out.print("Columna: ");
    int columna = scanner.nextInt() - 1;
    CoordenadaX = fila;
    CoordenadaY = columna;

    if (mapa[fila][columna] == 2) {
      System.out.println("ya fue rescatado");
    }
    if (mapa[fila][columna] == 0) {
      System.out.println("fallaste");
    }

    if (mapa[fila][columna] == 1) {

      mapa[fila][columna] = 2;
      cantidaSoldadosRescatados++;
      System.out.println("acertaste");
    }
    gano = false;
    if (cantidaSoldadosRescatados == cantidadSoldados) {
      gano = true;

    }

    System.out.println("Soldados rescatados: " + cantidaSoldadosRescatados);

  }

  public static int CoordenadaX() {

    return CoordenadaX;

  }

  public static int CoordenadaY() {

    return CoordenadaY;

  }

  public static void CantidadSoldados(int cantidad) {
    cantidadSoldados = cantidad;
  }

  public static boolean gano() {

    return gano;

  }

}
