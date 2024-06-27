
public class Ornitorrinco extends Ave{

    @Override
    public void mostrar() {
        super.mostrar();
        mostrarEspecifico();
    }

    public void mostrarEspecifico() {
        System.out.println("El ornitorrinco tiene: ");
    }

}
