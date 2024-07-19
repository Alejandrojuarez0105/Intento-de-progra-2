class TarjetaCuatro extends Tarjeta {
    public TarjetaCuatro() {
        super("Dime (1 SI / Otro número NO) si está en la tarjeta número 4: ");
    }

    @Override
    public int getValorTarjeta() {
        return 8;
    }
}