import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int answer = 1;
            if (n - 2 <= 0) {
                answer = 0;
            } else {
                n -= 2;
                while (n > x) {
                    n -= x;
                    answer++;
                }
            }
            System.out.println(answer + 1);
        }
    }
}
