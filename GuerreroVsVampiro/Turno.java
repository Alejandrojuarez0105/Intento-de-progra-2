class Turno {

    private boolean turnoGuerrero;

    public Turno() {
        this.turnoGuerrero = true;
    }

    public boolean turnoGuerrero() {
        return turnoGuerrero;
    }

    public void cambiarTurno() {
        this.turnoGuerrero = !this.turnoGuerrero;
    }

}
