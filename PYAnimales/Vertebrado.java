class Vertebrado extends Animal {

    protected String huesos;

    public Vertebrado(){
        super();
        this.huesos = "Huesos";
    }


    public void romperHuesos(){
        System.out.println("El vertebrado se rompio los huesos");
    }

    @Override
    public void mostrar() {
        System.out.println("Un animal vertebrado tiene:");
        super.mostrar();
        System.out.println("* " + huesos);
        Mamifero mamifero = new Mamifero();
        mamifero.mostrarEspecifico();
        System.out.println("-".repeat(30));
        Ave ave = new Ave();
        ave.mostrarEspecifico();
    }
}
