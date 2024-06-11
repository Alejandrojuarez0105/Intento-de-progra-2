public class Beca {

    private Becario[] becarios;
    private Profesor[] esperando;
    private int ultimoProfesor;
    private int ultimoBecario;
    private int becariosEliminados;

    public Beca() {
        String[] nombresBecarios = new String[] { "David", "Eva", "Josue", "Alejandro" };
        becarios = new Becario[4];
        for (int i = 0; i < becarios.length; i++) {
            becarios[i] = new Becario(nombresBecarios[i]);
            ultimoBecario++;
        }
        esperando = new Profesor[20];
        ultimoProfesor = 0;
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
        if (ultimoProfesor >= 15 && becariosEliminados < 3) {
            eliminarBecario(3);
            becariosEliminados++;
        } else if (ultimoProfesor >= 10 && becariosEliminados < 2) {
            eliminarBecario(2);
            becariosEliminados++;
        } else if (ultimoProfesor >= 5 && becariosEliminados < 1) {
            eliminarBecario(1);
            becariosEliminados++;
        }

        if (ultimoProfesor > 0) {
            deColaABecario();
        }
        becariosAyudan();
    }

    private void eliminarBecario(int i) {
        if (ultimoBecario > 1) {
            Becario becarioMuerto = becarios[ultimoBecario - 1];
            System.out.print("");
            System.out.println("El becario " + becarioMuerto.getNombre() + " murio por exceso de trabajo");
            System.out.print("");
            ultimoBecario--;
        }
    }

    private void deColaABecario() {
        for (int i = 0; i < ultimoBecario; i++) {
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
