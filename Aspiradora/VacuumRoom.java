
public class VacuumRoom {

    public static void main(String[] args) {

        int[][] office = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        renderWorld(office);
    }

    static void renderWorld(int[][] world) {
        for (int row = 0; row < world.length; row++) {
            for (int column = 0; column < world[row].length; column++) {
                System.out.print(showTile(world[row][column]));
            }
            System.out.println();
        }
        System.out.println("Nivel de suciedad: " + calculateDirtLevel(world));
    }

    static String showTile(int tile) {
        String[] tiles = { " . ", "...", "ooo", "OOO", "000", "***", "(O)", "---" };
        return tiles[tile];
    }

    static int calculateDirtLevel(int[][] world) {

        int dirtLevel = 0;

        for (int ejeY = 0; ejeY < world.length; ejeY++) {
            for (int ejeX = 0; ejeX < world[ejeY].length; ejeX++) {
                dirtLevel = dirtLevel + world[ejeY][ejeX];
            }
        }
        return dirtLevel;
    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pause(int segundos) {
        try {
            Thread.sleep(500 * segundos);
        } catch (InterruptedException e) {
        }
    }
}