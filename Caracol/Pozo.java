class Pozo {
    private static final int PROFUNDIDAD = 20;

    public void mostrarEstado(Caracol caracol) {
        for (int i = 1; i >= -PROFUNDIDAD; i--) {
            if (i == (int) caracol.getAltura()) {
                System.out.println("[]    _@)_/’    []" + i);
            } else if (i == 1) {
                System.out.println("[__]           [__]");
            } else if (i > caracol.getAltura()) {
                System.out.println("[]:. :. :. :. :.[]" + i);
            } else {
                System.out.println("[]~~~~~~~~~~~~~~[]" + i);
            }
        }
        System.out.println("[][][][][][][][][]");
    }
}