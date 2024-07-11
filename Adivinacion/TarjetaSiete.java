class TarjetaSiete extends Tarjeta {
    public TarjetaSiete() {
        super("Dime (1 SI / Otro número NO) si está en la tarjeta número 7: ");
    }

    @Override
    public int getValorTarjeta() {
        return 64;
    }
}