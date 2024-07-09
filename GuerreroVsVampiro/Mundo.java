import java.util.Scanner;

class Mundo {

    private Guerrero guerrero;
    private Vampiro vampiro;
    private Turno turno;
    private Scanner scanner;

    public Mundo() {
        guerrero = new Guerrero();
        vampiro = new Vampiro();
        turno = new Turno();
        scanner = new Scanner(System.in);
    }

    public void jugar() {
        System.out.println("Presiona enter para iniciar la batalla");
        scanner.nextLine();
        while (guerrero.vida() > 0 && vampiro.vida() > 0) {
            scanner.nextLine();
            if (turno.turnoGuerrero()) {
                System.out.println("Seleccione el arma del guerrero: (0:Hacha, 1: Espada, 2: Latigo)");
                int seleccion = scanner.nextInt();
                scanner.nextLine();
                guerrero.seleccionarArma(seleccion);
                if (guerrero.atacar()) {
                    vampiro.recibirDaño(guerrero.ataque());
                    System.out.println("El guerrero ataca y causa " + guerrero.ataque()
                            + " de daño. Ahora el vampiro tiene " + vampiro.vida() + " HP");
                } else {
                    System.out.println("El guerrero falló su ataque");
                }
            } else {
                if (vampiro.atacar()) {
                    guerrero.recibirDaño(vampiro.ataque());
                    System.out.println("El vampiro ataca y causa " + vampiro.ataque()
                            + " de daño. Ahora el guerrero tiene " + guerrero.vida() + " HP");
                } else {
                    System.out.println("El vampiro falló su ataque");
                }
            }
            turno.cambiarTurno();
        }
        if (guerrero.vida() > 0) {
            System.out.println("El guerrero ganó la batalla");
        } else {
            System.out.println("El vampiro ganó la batalla");
        }
    }

    public static void main(String[] args) {
        Mundo mundo = new Mundo();
        mundo.jugar();

    }
}