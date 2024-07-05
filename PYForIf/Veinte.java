class Veinte {
    public static void main(String[] args) {
        int dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {
                int pintarJ = (j - 1) / 2;
                int pintarI = (i - 1) / 2;

                if (
                    (i == 21 || j == 21) || ((pintarI + pintarJ) % 2 == 0)
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