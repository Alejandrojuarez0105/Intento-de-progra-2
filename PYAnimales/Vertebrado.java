class Vertebrado extends Animal {

    protected String huesos;

    Mamifero mamifero = new Mamifero();
    Ave ave = new Ave();

    public void mostrar() {
        System.out.println("Un animal vertebrado tiene:");
        System.out.println("* Celulas ");
        System.out.println("* Huesos ");
        mamifero.mostrar();
        ave.mostrar();
    }
}
