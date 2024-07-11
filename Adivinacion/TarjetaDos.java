class TarjetaDos extends Tarjeta {
    public TarjetaDos() {
        super("Dime (1 SI / Otro número NO) si está en la tarjeta número 2: ");
    }

    @Override
    public int getValorTarjeta() {
        return 2;
    }
}