class Niño {

    private double velocidad;
    private double tiempo;

    private final double MINIMA_VELOCIDAD_DIARIA = 10;
    private final double MAXIMA_VELOCIDAD_DIARIA = 15;

    private final double MINIMO_TIEMPO_DIARIO = 8;
    private final double MAXIMO_TIEMPO_DIARIO = 10;

    public void actualizar(Clima clima, Mono mono) {
        double condicionVelocidad = clima.estaLloviendoFuerte() ? 0.25 : clima.estaLloviendo() ? 0.75 : 1;
        condicionVelocidad = condicionVelocidad * (mono.estaCansado() ? 0.9 : 1);
        double condicionTiempo = mono.escapa() ? 2 : 0;
        velocidad = (Math.random() * (MAXIMA_VELOCIDAD_DIARIA - MINIMA_VELOCIDAD_DIARIA) + MINIMA_VELOCIDAD_DIARIA)
                * condicionVelocidad;
        tiempo = (Math.random() * (MAXIMO_TIEMPO_DIARIO - MINIMO_TIEMPO_DIARIO) + MINIMO_TIEMPO_DIARIO)
                - condicionTiempo;
    }

    public double avanzar() {
        return velocidad * tiempo;
    }
}