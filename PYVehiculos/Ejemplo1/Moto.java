package Ejemplo1;

public class Moto {

    private String marca;
    private String modelo;
    private String año;

    public Moto(String marca, String modelo, String año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrar() {
        System.out.println("Moto de marca " + marca + " modelo " + modelo + " del año " + año);
    }

}
