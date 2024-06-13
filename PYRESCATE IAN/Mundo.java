class Mundo {

  final static int x = 4;
  final static int y = 4;
  static int[][] mapa = new int[x][y];

  public static void RescateInicio() {
    Soldado soldado = new Soldado(5);
    soldado.colocar(mapa);
    Jugador.CantidadSoldados(Soldado.CantidadSoldados());
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void mostarMapa() {
    System.out.println("   1 2 3 4");
    System.out.println("   -------");
    for (int i = 0; i < x; i++) {
      System.out.print(i + 1 + "| ");
      for (int j = 0; j < y; j++) {
        System.out.print(mapa[i][j] + " ");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) throws InterruptedException {

    Mundo.RescateInicio();
    for (int i = 1; i <= 10; i++) {

      System.out.println("turno N: " + i);
      Mundo.mostarMapa();
      Jugador.Jugar(mapa);
      if (mapa[Jugador.CoordenadaX()][Jugador.CoordenadaY()] == 2) {
        i++;
      }
      if (Jugador.gano()) {
        System.out.println("Haz ganado");
        break;
      }
      Thread.sleep(2000);
      Mundo.clearScreen();

    }

  }
}
