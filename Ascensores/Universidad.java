class Universidad {
    private Ascensor[] ascensores;
    private Persona[][] personasEsperando;

    public Universidad(int cantidadAscensores) {
        this.ascensores = new Ascensor[cantidadAscensores];
        for (int i = 0; i < cantidadAscensores; i++) {
            ascensores[i] = new Ascensor(6);
        }
        this.personasEsperando = new Persona[7][];
    }

    public void agregarAscensor(Ascensor ascensor, int indice) {
        ascensores[indice] = ascensor;
    }

    public void llegarPersona(Persona persona) {
        int destino = persona.getDestino();
        if (personasEsperando[destino + 3] == null) {
            personasEsperando[destino + 3] = new Persona[10];
        }
        int i = 0;
        while (i < personasEsperando[destino + 3].length && personasEsperando[destino + 3][i] != null) {
            i++;
        }
        if (i < personasEsperando[destino + 3].length) {
            personasEsperando[destino + 3][i] = persona;
        }
    }

    public void moverAscensores() {
        int numAscensores = ascensores.length;
        for (int i = 0; i < numAscensores; i++) {
            Ascensor ascensor = ascensores[i];
            int estado = ascensor.getEstado();
            if (estado == Ascensor.SUBIENDO) {
                ascensor.subir();
            } else if (estado == Ascensor.BAJANDO) {
                ascensor.bajar();
            }
        }
    }

    public void visualizarEstado() {
        for (int i = 3; i >= -3; i--) {
            System.out.print("Planta " + i + "\t");
            int numAscensores = ascensores.length;
            for (int j = 0; j < numAscensores; j++) {
                Ascensor ascensor = ascensores[j];
                if (ascensor.getPlantaActual() == i) {
                    int estado = ascensor.getEstado();
                    if (estado == Ascensor.SUBIENDO) {
                        System.out.print("[^" + ascensor.getCantidadPersonas() + "^]\t");
                    } else if (estado == Ascensor.BAJANDO) {
                        System.out.print("[v" + ascensor.getCantidadPersonas() + "v]\t");
                    } else {
                        System.out.print("[" + ascensor.getCantidadPersonas() + "]\t");
                    }
                } else {
                    System.out.print("| |\t");
                }
            }
            System.out.println();
        }
    }
}
