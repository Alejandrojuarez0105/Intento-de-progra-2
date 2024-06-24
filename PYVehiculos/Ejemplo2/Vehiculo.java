package Ejemplo2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrar() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }

    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2016);
        Moto moto = new Moto("Kawasaki", "Ninja", 2021);

        coche.mostrar();
        moto.mostrar();
    }
}
