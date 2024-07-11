public abstract class Escala {
    protected Nota nota;
    protected String[] escala;

    public Escala(Nota nota) {
        this.nota = nota;
        this.escala = new String[8];
        construirEscala();
    }

    protected abstract void construirEscala();

    public void imprimirEscala() {
        for (String n : escala) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public Acorde construirAcordeNatural() {
        return new Acorde(new String[] { escala[0], escala[2], escala[4] });
    }
}
