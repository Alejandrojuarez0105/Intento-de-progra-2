public class Mamifero extends Vertebrado {

    protected String labios;

    public Mamifero() {
        super();
        this.labios = "Labios";
    }

    public void mamar() {
        System.out.println("El mamífero está mamando");
    }

    @Override
    public void mostrar() {
        super.mostrar();
        mostrarEspecifico();
    }

    public void mostrarEspecifico() {
        System.out.println("El mamífero tiene: ");
        System.out.println("* " + labios);
        Humano humano = new Humano();
        humano.mostrarEspecifico();
        System.out.println("-".repeat(30));
        Canino canino = new Canino();
        canino.mostrarEspecifico();
    }

}
