class TarjetaCinco extends Tarjeta {
    public TarjetaCinco() {
        super("Dime (1 SI / Otro número NO) si está en la tarjeta número 5: ");
    }

    @Override
    public int getValorTarjeta() {
        return 16;
    }
}