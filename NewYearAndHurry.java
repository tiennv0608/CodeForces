import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int timeLeft = 240 - k;
        int count = 0;
        int timeSolve = 0;
        if (timeLeft != 0) {
            for (int i = 1; i <= n; i++) {
                timeSolve += (5 * i);
                if (timeLeft - timeSolve < 0) {
                    break;
                } else if (timeLeft - timeSolve < 5 * (i + 1)) {
                    count = i;
                    break;
                } else {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
