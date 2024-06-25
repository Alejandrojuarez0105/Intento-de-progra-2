class Mundo{
    public static void main(String[] args) {
        EsclavoAgil esclavoAgil = new EsclavoAgil();
        EsclavoFenix esclavoFenix = new EsclavoFenix();
        EsclavoOrdenacion esclavoOrdenacion = new EsclavoOrdenacion();

        esclavoAgil.mostrar();
        System.out.println("-".repeat(30));
        esclavoFenix.mostrar();
        System.out.println("-".repeat(30));
        esclavoOrdenacion.mostrar();
        System.out.println("-".repeat(30));
        
    }
}