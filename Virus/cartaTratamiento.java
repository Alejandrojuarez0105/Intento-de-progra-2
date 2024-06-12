public class cartaTratamiento extends Carta {

    public cartaTratamiento(String nombre) {
        super(nombre);
    }

    @Override
    public void usar(Jugador jugador, Juego juego) {
        System.out.println(jugador.getNombre() + " juega " + getNombre() + " (Tratamiento Especial)");
        Jugador objetivo = juego.seleccionarJugador();
        if (objetivo != null) {
            boolean efectoAplicado = false;
            for (cartaOrganos organo : objetivo.getOrganos()) {
                if (!objetivo.getOrganosInfectados().contains(organo)) {
                    objetivo.infectarOrgano(organo.getColor());
                    efectoAplicado = true;
                    System.out.println("Órgano sano de color " + organo.getColor() + " ha sido infectado.");
                    break;
                }
            }
            if (!efectoAplicado) {
                for (cartaOrganos organo : objetivo.getOrganosInfectados()) {
                    objetivo.curarOrgano(organo.getColor());
                    System.out.println("Órgano infectado de color " + organo.getColor() + " ha sido curado.");
                    break;
                }
            }
        }
    }
}
