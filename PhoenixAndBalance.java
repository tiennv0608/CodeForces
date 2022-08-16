import java.util.Scanner;

public class PhoenixAndBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sumFirst = 0, sumSecond = 0;
            for (int j = 1; j <= n; j++) {
                if (j == n || j < n / 2) {
                    sumFirst += Math.pow(2, j);
                } else {
                    sumSecond += Math.pow(2, j);
                }
            }
            System.out.println(sumFirst - sumSecond);
        }
    }
}
