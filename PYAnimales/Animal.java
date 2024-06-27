class Animal {

    protected String celulas;
    
    public Animal(){
        this.celulas = "Celulas";
    }

    public void comer(){
        System.out.println("El animal está comiendo");
    }

    public void mostrar(){
        System.out.println("* " + celulas);
    }

    public static void main(String[] args) {
        
        Vertebrado vertebrado = new Vertebrado();
        Invertebrado invertebrado = new Invertebrado();

        System.out.println("El animal tiene celulas");
        
        vertebrado.mostrar();
        System.out.println("-".repeat(30));
        invertebrado.mostrar();
    }

}
