public class Ave extends Vertebrado{

    protected String pico;

    public Ave() {
        super();
        this.pico = "Pico";
    }

    public void volar() {
        System.out.println("El ave vuela");
    }

    public void ponerHuevos() {
        System.out.println("El ave pone huevos");
    }

    @Override
    public void mostrar() {
        super.mostrar();
        mostrarEspecifico();
    }

    public void mostrarEspecifico() {
        System.out.println("El ave tiene: ");
        System.out.println("* " + pico);
        Ornitorrinco ornitorrinco = new Ornitorrinco();
        ornitorrinco.mostrarEspecifico();
    }

}
