public class Editor {
    private String[] document;
    private int activeLine;

    public Editor() {
        document = new String[] {
                "Bienvenidos al editor EDLIN",
                "Utilice el menu inferior para editar el texto",
                "------",
                "[L] permite definir la linea activa",
                "[E] permite editar la linea activa",
                "[I] permite intercambiar dos lineas",
                "[B] borra el contenido de la linea activa",
                "[S] sale del programa",
                "",
                ""
        };
        activeLine = 0;
    }

    public void print() {
        clearScreen();
        printHorizontalLine();
        for (int i = 0; i < document.length; i++) {
            System.out.println(i + separator(i) + document[i]);
        }
        printHorizontalLine();
    }

    private String separator(int line) {
        return line == activeLine ? ":*| " : ": | ";
    }

    private void printHorizontalLine() {
        System.out.println("-".repeat(50));
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void delete() {
        System.out.println(
                "Esta acción es irreversible: indique el número de línea activa para confirmarlo [" + activeLine + "]");
        if (Menu.askInt() == activeLine) {
            document[activeLine] = "";
        }
    }

    public void exchangeLines() {
        int originLine, destinationLine;
        String temporaryLine;
        boolean validLine;

        do {
            System.out.print("Indique primera línea a intercambiar: ");
            originLine = Menu.askInt();
            validLine = originLine >= 0 && originLine < document.length;
        } while (!validLine);

        do {
            System.out.print("Indique segunda línea a intercambiar: ");
            destinationLine = Menu.askInt();
            validLine = destinationLine >= 0 && destinationLine < document.length;
        } while (!validLine);

        temporaryLine = document[destinationLine];
        document[destinationLine] = document[originLine];
        document[originLine] = temporaryLine;
    }

    public void edit() {
        System.out.println("EDITANDO> " + document[activeLine]);
        document[activeLine] = Menu.askString();
    }

    public void setActiveLine() {
        boolean validLine;
        do {
            System.out.print("Indique la nueva línea activa: ");
            activeLine = Menu.askInt();
            validLine = activeLine >= 0 && activeLine < document.length;
        } while (!validLine);
    }
}
