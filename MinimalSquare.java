import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = (a < b) ? a : b;
            int max = (a >= b) ? a : b;
            if (min * 2 > max) {
                System.out.println((min * 2) * (min * 2));
            } else {
                System.out.println(max * max);
            }
        }
    }
}
