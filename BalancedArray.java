import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if ((n / 2) % 2 == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int sum = 0;
                for (int j = 2; j <= n; j += 2) {
                    System.out.print(j + " ");
                    sum += j;
                }
                int sumOdd = 0;
                for (int j = 1; j <= n; j += 2) {
                    if (j != n - 1) {
                        System.out.print(j + " ");
                        sumOdd += j;
                    }
                }
                System.out.print(sum - sumOdd);
                System.out.println();
            }
        }
    }
}
