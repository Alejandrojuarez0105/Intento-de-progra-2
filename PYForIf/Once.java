class Once {
    public static void main(String[] args) {
        int dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                    (((i >= 1 && i <= 10) || (i >= 12 && i <= 21))) || (((j >= 1 && j <= 10) || (j >= 12 && j <= 21)))
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}