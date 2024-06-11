package src;

class Cliente {
    private int items;

    public Cliente() {
        this.items = (int) (Math.random() * 11) + 5;
    }

    public int getNumeroItems() {
        return items;
    }
}
