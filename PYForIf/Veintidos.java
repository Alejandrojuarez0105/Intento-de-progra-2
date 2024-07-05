class Veintidos {
    public static void main(String[] args) {
        int dimension = 21;
        int centro = dimension / 2;
        int radio = 5;

        for (int j = 0; j < dimension; j++) {
            for (int i = 0; i < dimension; i++) {
                int direccionI = i - centro;
                int direccionJ = j - centro;
                double distance = Math.sqrt(direccionI * direccionI + direccionJ * direccionJ);

                if ((i >= 1 || i <= 21) && !(distance > radio - 0.5 && distance < radio + 0.5)) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}