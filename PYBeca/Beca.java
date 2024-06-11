public class Beca {

    private Becario[] becarios;
    private Profesor[] esperando;
    private int ultimoProfesor;
    private int ultimoBecario;
    private String[] nombresBecarios;

    public Beca() {
        nombresBecarios = new String[]{"David", "Eva", "Josue", "Alejandro"};
        becarios = new Becario[4];
        for (int i = 0; i < becarios.length; i++) {
            becarios[i] = new Becario(nombresBecarios[i]);
        }
        esperando = new Profesor[20];
        ultimoProfesor = 0;
        ultimoBecario = 4;
    }

    public void recibe(Profesor profesor) {
        if (ultimoProfesor < esperando.length) {
            esperando[ultimoProfesor] = profesor;
            ultimoProfesor++;
        } else {
            System.out.println(("-").repeat(40));
            System.out.println("Esperense que ya no hay más espacio");
            System.out.println(("-").repeat(40));
        }
    }

    public void actualizar() {
        if (ultimoProfesor > 0) {
            deColaABecario();
        }
        becariosAyudan();
    }

    
    private void deColaABecario() {
        for (int i = 0; i < becarios.length; i++) {
            if (ultimoProfesor > 0 && becarios[i].estaLibre()) {
                Profesor profesor = esperando[ultimoProfesor - 1];
                ultimoProfesor--;
                becarios[i].recibe(profesor);
            }
        }
    }
    
    private void becariosAyudan() {
        for (int i = 0; i < becarios.length; i++) {
            becarios[i].ayudan();
        }
    }

    
    public void verEstado(int minutoActual) {
        System.out.println("Minuto actual: " + minutoActual);
        System.out.println(ultimoProfesor + " profesores esperando");
        for (int i = 0; i < ultimoBecario; i++) {
            becarios[i].verEstado();
        }

    }
}
