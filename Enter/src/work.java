import java.util.Scanner;

public class work {
    public static void main(String args[]) {
        System.out.print("enter number 1:");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        System.out.print("enter number 2:");
        long b = sc.nextInt();
        long sum = 5 * (a + b);
        System.out.print("sum of two number:-");
        System.out.print(sum);
    }
}
