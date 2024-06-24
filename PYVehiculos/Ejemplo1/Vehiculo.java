package Ejemplo1;

class Vehiculo {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", "2016");
        Moto moto = new Moto("Kawasaki", "Ninja", "2021");

        coche.mostrar();
        moto.mostrar();
    }
}
