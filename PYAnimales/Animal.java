class Animal {

    protected String celulas;

    public static void main(String[] args) {
        Vertebrado vertebrado = new Vertebrado();
        Invertebrado invertebrado = new Invertebrado();

        vertebrado.mostrar();
        System.out.println("-".repeat(30));
        invertebrado.mostrar();
    }

}
