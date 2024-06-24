package Ejemplo1;

public class Coche {

    private String marca;
    private String modelo;
    private String año;

    public Coche(String marca, String modelo, String año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrar() {
        System.out.println("Coche de marca " + marca + " modelo " + modelo + " del año " + año);
    }

}
