package src;

public class Estadisticas {

    private int minutosSinCola;
    private int personasEnCola;
    private int personasAtendidas;
    private int itemsVendidos;

    public void incrementarMinutosSinCola() {
        minutosSinCola++;
    }

    public int getMinutosSinCola() {
        return minutosSinCola;
    }

    public int getPersonasEnCola() {
        return personasEnCola;
    }

    public void incrementarPersonasAtendidas() {
        personasAtendidas++;
    }

    public int getPersonasAtendidas() {
        return personasAtendidas;
    }

    public void incrementarItemsVendidos(int items) {
        itemsVendidos += items;
    }

    public int getItemsVendidos() {
        return itemsVendidos;
    }

    public void actualizarEstadisticas(CentroComercial carrefour) {
        this.personasEnCola = carrefour.getPersonasEnCola();
        this.personasAtendidas = carrefour.getPersonasAtendidas();
        this.itemsVendidos = carrefour.getItemsVendidos();
    }

    public void mostrar() {
        System.out.println("Resultados al final del día:");
        System.out.println("Número de minutos en que no hubo nadie en cola: " + minutosSinCola);
        System.out.println("Número de personas que estaban en cola al finalizar el día: " + personasEnCola);
        System.out.println("Número de personas atendidas durante el día: " + personasAtendidas);
        System.out.println("Número de items vendidos en el día: " + itemsVendidos);
    }
}
