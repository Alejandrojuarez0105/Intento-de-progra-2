import java.util.Random;

public class Soldado {
  private static int cantidadSoldados;

  public Soldado(int cantidadSoldados) {
    Soldado.cantidadSoldados = cantidadSoldados;
  }

  public static int CantidadSoldados() {
    return cantidadSoldados;
  }

  public void colocar(int[][] mapa) {
    Random rand = new Random();
    int filas = mapa.length;
    int columnas = mapa[0].length;

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        mapa[i][j] = 0;
      }
    }

    int soldadosColocados = 0;
    while (soldadosColocados < cantidadSoldados) {
      int filaAleatoria = rand.nextInt(filas);
      int columnaAleatoria = rand.nextInt(columnas);
      if (mapa[filaAleatoria][columnaAleatoria] == 0) {
        mapa[filaAleatoria][columnaAleatoria] = 1;
        soldadosColocados++;
      }
    }
  }
}
