class TarjetaUno extends Tarjeta {
    public TarjetaUno() {
        super("Dime (1 SI / Otro número NO) si está en la tarjeta número 1: ");
    }

    @Override
    public int getValorTarjeta() {
        return 1;
    }
}