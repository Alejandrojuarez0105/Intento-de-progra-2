import java.util.Scanner;

class Mundo {

    private Guerrero guerrero;
    private Vampiro vampiro;
    private Turno turno;

    public Mundo(){
        guerrero = new Guerrero();
        vampiro = new Vampiro();
        turno = new Turno();
    }

    public void jugar() {
        System.out.println("Presiona enter para iniciar la batalla");
       while (guerrero.vida() > 0 && vampiro.vida()> 0 ) {
        new Scanner(System.in).nextLine();
        if (turno.turnoGuerrero()){
            if(guerrero.atacar()){
                vampiro.recibirDaño(guerrero.ataque());
                System.out.println("El guerrero ataca y causa " + guerrero.ataque() + " de daño. Ahora el vampiro tiene " + vampiro.vida() + " HP");
            } else{
                System.out.println("El guerrero falló su ataque");
            }
        } else {
            if (vampiro.atacar()){
                guerrero.recibirDaño(vampiro.ataque());
                    System.out.println("El vampiro ataca y causa " + vampiro.ataque() + " de daño. Ahora el guerrero tiene " + guerrero.vida() + " HP");
            } else {
                System.out.println("El vampiro falló su ataque");
            }
        }
        turno.cambiarTurno();
       }
       if (guerrero.vida()> 0){
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