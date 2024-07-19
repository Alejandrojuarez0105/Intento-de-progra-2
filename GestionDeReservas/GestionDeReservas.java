class GestionDeReservas {
    public static void main(String[] args) {
        SistemaReservas sistemaReservas = new SistemaReservas(6);
        Menu menu = new Menu(sistemaReservas);
        menu.mostrarMenu();
    }
}