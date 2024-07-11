public class Nota {
    private static final String[] NOTAS = { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };
    private String nombre;

    public Nota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIndice() {
        for (int indice = 0; indice < NOTAS.length; indice++) {
            if (contieneSinCase(NOTAS[indice], nombre)) {
                return indice;
            }
        }
        return -1;
    }

    public static String getNotaPorIndice(int indice) {
        // Adjust negative indices
        while (indice < 0) {
            indice += 12;
        }
        return NOTAS[indice % 12];
    }

    private static boolean contieneSinCase(String str1, String str2) {
        return str1.toUpperCase().contains(str2.toUpperCase());
    }
}
