import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int mod = n % x;
            if (mod == y) {
                System.out.println(n);
            } else if (mod < y) {
                System.out.println(n - (x - y + mod));
            } else {
                System.out.println(n - (mod - y));
            }
        }

    }
}
