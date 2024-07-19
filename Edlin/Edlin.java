class Edlin {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Menu menu = new Menu(editor);

        System.out.println("Bienvenidos al editor EDLIN");
        System.out.println("Utilice el menú inferior para editar el texto");
        System.out.println("------");

        while (true) {
            editor.print();
            menu.mostrarMenu();
            if (!menu.procesarOpcion()) {
                break;
            }
        }
    }
}
