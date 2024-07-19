class TarjetaTres extends Tarjeta {
    public TarjetaTres() {
        super("Dime (1 SI / Otro número NO) si está en la tarjeta número 3: ");
    }

    @Override
    public int getValorTarjeta() {
        return 4;
    }
}