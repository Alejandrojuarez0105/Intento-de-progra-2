public class Navegador {

    private int filaActual;
    private int columnaActual;
    private HojaDeCalculo hoja;

    public Navegador(HojaDeCalculo hoja) {
        this.hoja = hoja;
        this.filaActual = 0;
        this.columnaActual = 0;
    }

    public void moverArriba() {
        if (filaActual > 0) {
            filaActual--;
        }
    }

    public void moverAbajo() {
        if (filaActual < hoja.getFilas() - 1) {
            filaActual++;
        }
    }

    public void moverIzquierda() {
        if (columnaActual > 0) {
            columnaActual--;
        }
    }

    public void moverDerecha() {
        if (columnaActual < hoja.getColumnas() - 1) {
            columnaActual++;
        }
    }

    public void editarCelda(String valor) {
        hoja.setCeldaValor(filaActual, columnaActual, valor);
    }

    public int getFilaActual() {
        return filaActual;
    }

    public int getColumnaActual() {
        return columnaActual;
    }

}
