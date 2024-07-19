class TarjetaSeis extends Tarjeta {
    public TarjetaSeis() {
        super("Dime (1 SI / Otro número NO) si está en la tarjeta número 6: ");
    }

    @Override
    public int getValorTarjeta() {
        return 32;
    }
}