import java.util.Scanner;

class SistemaReservas {
    private Aula[] aulas;

    public SistemaReservas(int numeroAulas) {
        this.aulas = new Aula[numeroAulas];

        for (int i = 0; i < numeroAulas; i++) {
            aulas[i] = new Aula(i + 1);
        }
    }

    public void listarAulas() {
        for (Aula aula : aulas) {
            aula.mostrarEstado();
        }
    }

    public void reservarAula(Scanner entrada) {
        System.out.println("Aula a reservar (0 para salir de reserva):");
        int aulaElegida = entrada.nextInt();
        entrada.nextLine();
        if (aulaElegida != 0) {
            Aula aula = aulas[aulaElegida - 1];
            if (aula.estaLibre()) {
                System.out.println("Alumno responsable de la solicitud:");
                String alumnoResponsable = entrada.nextLine();
                System.out.println("Alumnos asistentes:");
                String alumnosAsistentes = entrada.nextLine();
                aula.reservar(alumnoResponsable, alumnosAsistentes);
                System.out.println("Aula " + aulaElegida + " reservada correctamente.");
            } else {
                System.out.println("El aula está ocupada.");
            }
        }
    }

    public void liberarAula(Scanner entrada) {
        System.out.println("Aula a liberar (0 para salir de reserva):");
        int aulaElegida = entrada.nextInt();
        if (aulaElegida != 0) {
            Aula aula = aulas[aulaElegida - 1];
            if (!aula.estaLibre()) {
                aula.liberar();
                System.out.println("Aula " + aulaElegida + " liberada correctamente.");
            } else {
                System.out.println("El aula no estaba ocupada.");
            }
        }
    }
}