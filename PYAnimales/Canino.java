public class Canino extends Mamifero{

    protected String colmillos;

    public Canino(){
        super();
        this.colmillos = "Colmillos";
    }

    @Override
    public void mostrar() {
        super.mostrar();
        mostrarEspecifico();
    }

    public void mostrarEspecifico() {
        System.out.println("El canino tiene: ");
        System.out.println("* " + colmillos);
    }
}
