public class cartaOrganos extends Carta {
    private String color;

    public cartaOrganos(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void usar(Jugador jugador, Juego juego) {
        System.out.println(jugador.getNombre() + " juega " + getNombre() + " (Órgano de color " + color + ")");
        jugador.agregarOrgano(this);
        System.out.println(jugador.getNombre() + " ha agregado un órgano de color " + color);
    }
}
