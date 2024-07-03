class Excel {
    public static void main(String[] args) {
        HojaDeCalculo hoja = new HojaDeCalculo();
        InterfazUsuario interfaz = new InterfazUsuario(hoja);
        interfaz.iniciar();
    }
}