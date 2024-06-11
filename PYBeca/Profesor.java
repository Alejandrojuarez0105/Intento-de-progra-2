public class Profesor {
    private int problemas;

    public Profesor(){
        this.problemas = (int) (Math.random() * 10)+1;
    }

    public int getProblemas(){
        return problemas;
    }
}
