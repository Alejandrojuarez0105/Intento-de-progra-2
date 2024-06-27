
public class Humano extends Mamifero{

    protected String raciocinio;

    public Humano() {
        super();
        this.raciocinio = "Raciocinio";
    }

    @Override
    public void mostrar() {
        super.mostrar();
        mostrarEspecifico();
    }

    public void mostrarEspecifico() {
        System.out.println("El humano tiene: ");
        System.out.println("* " + raciocinio);
    }

}
