public class Jugador {
    private String nombre;
    private Carta[] mano;
    private cartaOrganos[] organos;
    private cartaOrganos[] organosInfectados;
    private int manoSize;
    private int organosSize;
    private int organosInfectadosSize;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new Carta[10];
        this.organos = new cartaOrganos[10];
        this.organosInfectados = new cartaOrganos[10];
        this.manoSize = 0;
        this.organosSize = 0;
        this.organosInfectadosSize = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Carta[] getMano() {
        return mano;
    }

    public void agregarCarta(Carta carta) {
        if (manoSize < mano.length) {
            mano[manoSize] = carta;
            manoSize++;
        } else {
            System.out.println("No se puede agregar más cartas a la mano.");
        }
    }

    public void jugarCarta(Carta carta, Juego juego) {
        carta.usar(this, juego);
        eliminarCarta(carta);
    }

    public void mostrarMano() {
        for (int i = 0; i < manoSize; i++) {
            System.out.println((i + 1) + ". " + mano[i].getNombre());
        }
    }

    public boolean haGanado() {
        return organosSize >= 4;
    }

    public boolean infectarOrgano(String color) {
        for (int i = 0; i < organosSize; i++) {
            if (organos[i].getColor().equals(color)) {
                cartaOrganos organo = organos[i];
                eliminarOrgano(organo);
                agregarOrganoInfectado(organo);
                return true;
            }
        }
        return false;
    }

    public boolean curarOrgano(String color) {
        for (int i = 0; i < organosInfectadosSize; i++) {
            if (organosInfectados[i].getColor().equals(color)) {
                cartaOrganos organo = organosInfectados[i];
                eliminarOrganoInfectado(organo);
                agregarOrgano(organo);
                return true;
            }
        }
        return false;
    }

    private void eliminarCarta(Carta carta) {
        for (int i = 0; i < manoSize; i++) {
            if (mano[i] == carta) {
                for (int j = i; j < manoSize - 1; j++) {
                    mano[j] = mano[j + 1];
                }
                manoSize--;
                return;
            }
        }
    }

    private void eliminarOrgano(cartaOrganos organo) {
        for (int i = 0; i < organosSize; i++) {
            if (organos[i] == organo) {
                for (int j = i; j < organosSize - 1; j++) {
                    organos[j] = organos[j + 1];
                }
                organosSize--;
                return;
            }
        }
    }

    private void eliminarOrganoInfectado(cartaOrganos organo) {
        for (int i = 0; i < organosInfectadosSize; i++) {
            if (organosInfectados[i] == organo) {
                for (int j = i; j < organosInfectadosSize - 1; j++) {
                    organosInfectados[j] = organosInfectados[j + 1];
                }
                organosInfectadosSize--;
                return;
            }
        }
    }

    private void agregarOrganoInfectado(cartaOrganos organo) {
        if (organosInfectadosSize < organosInfectados.length) {
            organosInfectados[organosInfectadosSize] = organo;
            organosInfectadosSize++;
        } else {
            System.out.println("No se puede agregar más órganos infectados.");
        }
    }

    public void agregarOrgano(cartaOrganos organo) {
        if (organosSize < organos.length) {
            organos[organosSize] = organo;
            organosSize++;
        } else {
            System.out.println("No se puede agregar más órganos.");
        }
    }

    public cartaOrganos[] getOrganos() {
        return organos;
    }

    public cartaOrganos[] getOrganosInfectados() {
        return organosInfectados;
    }
}