public class cartaVirus extends Carta {
    private String color;

    public cartaVirus(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    @Override
    public void usar(Jugador jugador, Juego juego) {
        System.out.println(jugador.getNombre() + " juega " + getNombre() + " (Virus de color " + color + ")");
        Jugador objetivo = juego.seleccionarJugador();
        if (objetivo != null) {
            boolean infectado = objetivo.infectarOrgano(color);
            if (infectado) {
                System.out.println(objetivo.getNombre() + " ha sido infectado con un virus de color " + color);
            } else {
                System.out.println(objetivo.getNombre() + " no tiene órganos de color " + color + " para infectar.");
            }
        }
    }
}
