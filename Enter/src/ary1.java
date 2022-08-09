
import java.io.*;
import java.util.*;

class ary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        long[] list1 = new long[n];
        for (int i = 0; i < n; i++) {
            list1[i] = sc.nextInt();
        }

        for (int i = 0; i < list1.length; i++)
            System.out.print(list1[i] + " ");
    }
}
