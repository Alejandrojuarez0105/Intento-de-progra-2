public class Mapa {
    private final char[][] mapa;

    public Mapa() {
        mapa = new char[][] {
                { '1', '1', '1', '1', '1', '1', '1', '1', '1' },
                { '1', '0', '0', '0', '0', '0', '0', '0', '1' },
                { '1', '0', '1', '0', '1', '0', '1', '0', '1' },
                { '1', '0', '1', '0', '1', '0', '1', '0', '1' },
                { '1', '0', '1', '0', '1', '0', '1', '0', '1' },
                { '1', '0', '1', '0', '1', '0', '1', '0', '1' },
                { '1', '0', '1', '0', '1', '0', '1', '0', '1' },
                { '1', '0', '0', '0', '0', '0', '0', '0', '1' },
                { '1', '1', '1', '1', '1', '1', '1', '1', '1' }
        };
    }

    public boolean esPared(int y, int x) {
        return mapa[y][x] == '1';
    }

    public void mostrarMapa(Pacman pacman) {
        Coordenadas posicionPacman = pacman.getPosicion();
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (i == posicionPacman.getY() && j == posicionPacman.getX()) {
                    System.out.print('C');
                } else {
                    System.out.print(mapa[i][j] == '0' ? ' ' : '#');
                }
            }
            System.out.println();
        }
    }
}
