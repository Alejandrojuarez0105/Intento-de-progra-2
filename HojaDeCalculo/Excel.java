public class Excel {
    private static final int FILAS = 15;
    private static final int COLUMNAS = 15;

    public static void main(String[] args) {
        HojaDeCalculo miHoja = new HojaDeCalculo(FILAS, COLUMNAS);
        InterfazUsuario interfazUsuario = new InterfazUsuario(miHoja);
        interfazUsuario.iniciar();
    }
}