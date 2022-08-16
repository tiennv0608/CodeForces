import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long count = 0, start;
            for (int j = 1; j <= 9; j++) {
                start = j;
                while (start <= n) {
                    count++;
                    start = start * 10 + j;
                }
            }
            System.out.println(count);
        }
    }
}
