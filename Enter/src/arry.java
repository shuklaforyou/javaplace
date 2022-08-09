import java.util.Scanner;

public class arry {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] mark = new int[size];

        for (int i = 0; i < size; i++) {
            mark[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(mark[i]);
            System.out.print(" ");
        }

    }

}
