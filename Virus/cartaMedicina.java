public class cartaMedicina extends Carta {
    private String color;

    public cartaMedicina(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    @Override
    public void usar(Jugador jugador, Juego juego) {
        System.out.println(jugador.getNombre() + " juega " + getNombre() + " (Medicina de color " + color + ")");
        boolean curado = jugador.curarOrgano(color);
        if (curado) {
            System.out.println("Órgano de color " + color + " ha sido curado!");
        } else {
            System.out.println("No hay órganos infectados de color " + color + " para curar.");
        }
    }
}
