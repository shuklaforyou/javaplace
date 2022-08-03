public class loop {
    public static void main(String args[]) {
        int i = 10;
        for (i = 1; i <= 10; i++) {
            // System.out.print(i + " ");
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else if (i == 5) {
                System.out.println("range end");
                break;

            }
        }
    }
}
