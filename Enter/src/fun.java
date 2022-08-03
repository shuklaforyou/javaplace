import java.util.Scanner;

public class fun {
    static int sumwork(int k, int p) {
        int qp = k + p;
        return qp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int sum = sumwork(i, j);
        System.out.println(sum);
    }
}
