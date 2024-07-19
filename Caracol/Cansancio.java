class Cansancio extends Extras {
    public Cansancio() {
        super();
    }

    @Override
    public void aplicarEfecto(Caracol caracol) {
        if (caracol.getContador() > 20 && caracol.getContador() < 50) {
            caracol.mover(-1, 0);
            System.out.println("El caracol está cansado y sube más lento.");
        }
    }
}
