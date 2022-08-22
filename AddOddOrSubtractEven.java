import java.util.Scanner;

public class AddOddOrSubtractEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int answer;
            if (a - b == 0) {
                answer = 0;
            } else if (a - b < 0) {
                if ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1)) {
                    answer = 2;
                } else {
                    answer = 1;
                }
            } else {
                if ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1)) {
                    answer = 1;
                } else {
                    answer = 2;
                }
            }
            System.out.println(answer);
        }
    }
}
