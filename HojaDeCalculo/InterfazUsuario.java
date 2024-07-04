import java.util.Scanner;

public class InterfazUsuario {
    private HojaDeCalculo hoja;
    private Navegador navegador;

    public InterfazUsuario(HojaDeCalculo hoja) {
        this.hoja = hoja;
        this.navegador = new Navegador(hoja);
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        String comando;
        boolean salir = false;

        while (!salir) {
            hoja.mostrarHoja(navegador.getFilaActual(), navegador.getColumnaActual());
            System.out.println("Utilice las teclas W, A, S y D para moverse.");
            System.out.println("Presione 'E' para ingresar texto en la celda actual.");
            System.out.println("Presione 'Q' para salir.");
            System.out.print("Ingrese un comando: ");
            comando = scanner.nextLine();
            switch (comando) {
                case "w":
                    navegador.moverArriba();
                    break;
                case "s":
                    navegador.moverAbajo();
                    break;
                case "a":
                    navegador.moverIzquierda();
                    break;
                case "d":
                    navegador.moverDerecha();
                    break;
                case "e":
                    System.out.println("Ingrese un nuevo valor para la celda: ");
                    String valor = scanner.nextLine();
                    navegador.editarCelda(valor);
                    break;
                case "q":
                    salir = true;
                    break;
                default:
                    System.out.println("Comando no reconocido");
            }
        }
        scanner.close();
    }

}
