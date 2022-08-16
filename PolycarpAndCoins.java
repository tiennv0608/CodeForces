import java.util.Scanner;

public class PolycarpAndCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int answer = n / 3;
            if (n % 3 == 0) {
                System.out.println(answer + " " + answer);
            } else if (n % 3 == 1) {
                System.out.println((answer + 1) + " " + answer);
            } else {
                System.out.println(answer + " " + (answer + 1));
            }
        }
    }
}
