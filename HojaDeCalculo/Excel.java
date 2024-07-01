class Excel {
    public static void main(String[] args) {
        HojaDeCalculo hoja = new HojaDeCalculo();
        InterfazUsuario interfazUsuario = new InterfazUsuario(hoja);
        interfazUsuario.iniciar();
    }
}