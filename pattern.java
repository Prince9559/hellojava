public class pattern {

    public static void main(String[] args) {

        int n = 7;
        boolean condition;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                condition = (j == 1) || (i == 1) && (j <= 5) || (j == 5) && (i <= 4) || (i == 4) && (j <= 5);

                if (condition) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            for (int j = 1; j <= n; j++) {

                condition = (j == 1) || (i == 1 && j <= 5) || (j == 5 && i <= 4) || (i == 4 && j <= 5)
                        || (i - j == 2 && i >= 4);

                if (condition) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            for (int j = 1; j <= n; j++) {

                condition = (i == 1) || (j == 4) || (i == 7);

                if (condition) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for (int j = 1; j <= n; j++) {

                condition = (j == 1) || (i == j) || (j == 7);

                if (condition) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for (int j = 1; j <= n; j++) {

                condition = (j == 1) || (i == 1) && (j <= 4) || (i == 7) && (j <= 4);

                if (condition) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("");

            for (int j = 1; j <= n; j++) {

                condition = (j == 1) || (i == 1) && (j <= 4) || (i == 7) && (j <= 4) || (i == 4) && (j <= 4);

                if (condition) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
