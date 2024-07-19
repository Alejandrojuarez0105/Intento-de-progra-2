public class Acorde {
    private String[] notas;

    public Acorde(String[] notas) {
        this.notas = notas;
    }

    public void imprimirAcorde() {
        for (String nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }
}
