public class EscalaMenor extends Escala {

    public EscalaMenor(Nota nota) {
        super(nota);
    }

    @Override
    protected void construirEscala() {
        int[] intervalos = { 2, 1, 2, 2, 1, 2, 2 };
        int indiceNota = nota.getIndice();

        for (int i = 0; i < 8; i++) {
            escala[i] = Nota.getNotaPorIndice(indiceNota);
            if (i < 7) {
                indiceNota += intervalos[i];
            }
        }
    }
}
