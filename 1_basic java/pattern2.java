public class pattern2 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                if (i == 0 || i == 2 || j == 0 || j == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
