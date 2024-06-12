public class Mazo {
    private NodoCarta inicio;
    private int cantidadCartas;

    public Mazo() {
        inicializarMazo();
    }

    private void inicializarMazo() {
        for (int i = 0; i < 4; i++) {
            agregarCarta(new cartaVirus("Virus Rojo", "Rojo"));
            agregarCarta(new cartaVirus("Virus Azul", "Azul"));
            agregarCarta(new cartaVirus("Virus Verde", "Verde"));
            agregarCarta(new cartaVirus("Virus Amarillo", "Amarillo"));
            agregarCarta(new cartaMedicina("Medicina Roja", "Rojo"));
            agregarCarta(new cartaMedicina("Medicina Azul", "Azul"));
            agregarCarta(new cartaMedicina("Medicina Verde", "Verde"));
            agregarCarta(new cartaMedicina("Medicina Amarilla", "Amarillo"));
            agregarCarta(new cartaOrganos("Corazón", "Rojo"));
            agregarCarta(new cartaOrganos("Hígado", "Verde"));
            agregarCarta(new cartaOrganos("Estómago", "Amarillo"));
            agregarCarta(new cartaOrganos("Cerebro", "Azul"));
            agregarCarta(new cartaTratamiento("Tratamiento Especial"));
        }

        mezclar();
    }

    private void agregarCarta(Carta carta) {
        NodoCarta nuevoNodo = new NodoCarta(carta);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            NodoCarta temp = inicio;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
        cantidadCartas++;
    }

    private void mezclar() {
        Carta[] cartasArray = new Carta[cantidadCartas];
        NodoCarta temp = inicio;
        int index = 0;
        while (temp != null) {
            cartasArray[index++] = temp.carta;
            temp = temp.siguiente;
        }

        for (int i = 0; i < cartasArray.length; i++) {
            int j = (int) (Math.random() * cartasArray.length);
            Carta tmp = cartasArray[i];
            cartasArray[i] = cartasArray[j];
            cartasArray[j] = tmp;
        }

        inicio = null;
        for (Carta carta : cartasArray) {
            agregarCarta(carta);
        }
    }

    public Carta robarCarta() {
        if (inicio == null) {
            return null;
        }
        Carta carta = inicio.carta;
        inicio = inicio.siguiente;
        cantidadCartas--;
        return carta;
    }

    private class NodoCarta {
        Carta carta;
        NodoCarta siguiente;

        NodoCarta(Carta carta) {
            this.carta = carta;
            this.siguiente = null;
        }
    }
}
