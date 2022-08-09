public class pp2 {
    public static void main(String args[]) {
        int n = 5;
        // int number = 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(1);
                    System.out.print(" ");
                } else {
                    System.out.print(0);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}