import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> mano;
    private ArrayList<cartaOrganos> organos;
    private ArrayList<cartaOrganos> organosInfectados;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
        this.organos = new ArrayList<>();
        this.organosInfectados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void agregarCarta(Carta carta) {
        mano.add(carta);
    }

    public void jugarCarta(Carta carta, Juego juego) {
        carta.usar(this, juego);
        mano.remove(carta);
    }

    public void mostrarMano() {
        for (int i = 0; i < mano.size(); i++) {
            System.out.println((i + 1) + ". " + mano.get(i).getNombre());
        }
    }

    public boolean haGanado() {
        return organos.size() >= 4;
    }

    public boolean infectarOrgano(String color) {
        for (cartaOrganos organo : organos) {
            if (organo.getColor().equals(color)) {
                organos.remove(organo);
                organosInfectados.add(organo);
                return true;
            }
        }
        return false;
    }

    public boolean curarOrgano(String color) {
        for (cartaOrganos organo : organosInfectados) {
            if (organo.getColor().equals(color)) {
                organosInfectados.remove(organo);
                organos.add(organo);
                return true;
            }
        }
        return false;
    }

    public void agregarOrgano(cartaOrganos organo) {
        organos.add(organo);
    }

    public ArrayList<cartaOrganos> getOrganos() {
        return organos;
    }

    public ArrayList<cartaOrganos> getOrganosInfectados() {
        return organosInfectados;
    }
}
