class Horas {
    private int horasLunes;
    private int horasMartes;
    private int horasMiercoles;
    private int horasJueves;
    private int horasViernes;

    public Horas(int horasLunes, int horasMartes, int horasMiercoles, int horasJueves, int horasViernes) {
        this.horasLunes = horasLunes;
        this.horasMartes = horasMartes;
        this.horasMiercoles = horasMiercoles;
        this.horasJueves = horasJueves;
        this.horasViernes = horasViernes;
    }

    public void mostrar() {
        System.out.println(
                "Lunes: " + horasLunes + ", Martes: " + horasMartes
                        + ", Miercoles: " + horasMiercoles + ", Jueves: " + horasJueves + ", Viernes: " + horasViernes);
    }

}
