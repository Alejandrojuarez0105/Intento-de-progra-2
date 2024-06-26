public class Mano {

    private Carta[] cartas;
    private int ultima;

    public Mano(Baraja baraja) {
        ultima = 0;
        cartas = new Carta[11];
        for (int i = 0; i < 2; i++) {
            Carta carta = baraja.sacar();
            carta.voltear();
            this.poner(carta);
        }
    }

    private void poner(Carta carta) {
        cartas[ultima] = carta;
        ultima++;
    }

    public void mostrar() {
        for (int i = 0; i < ultima; i++) {
            this.cartas[i].mostrar();
        }
        System.out.println(" - Puntaje:" + this.obtenerPuntaje());
    }

    public boolean haGanado() {
        return this.obtenerPuntaje() == 21;
    }

    public boolean haPerdido() {
        return this.obtenerPuntaje() > 21;
    }

    private int obtenerPuntaje() {
        int puntaje = 0;
        int ases = 0;
        for (int i = 0; i < ultima; i++) {
            Carta carta = cartas[i];
            int valor = carta.getNumero() + 1;
            if (valor >= 10) {
                valor = 10;
            } else if (valor == 1) {
                valor = 11;
                ases++;
            }
            puntaje = puntaje + valor;
        }

        while (puntaje > 21 && ases > 0) {
            puntaje = puntaje - 10;
            ases = ases - 1;
        }

        return puntaje;
    }

    public void pedir(Baraja baraja) {
        Carta carta = baraja.sacar();
        carta.voltear();
        this.poner(carta);
    }
}