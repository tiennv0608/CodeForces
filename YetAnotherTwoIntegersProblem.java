import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int move = Math.abs(a - b);
            if (move == 0) {
                System.out.println(move);
            } else if (move % 10 != 0) {
                System.out.println(move / 10 + 1);
            } else {
                System.out.println(move / 10);
            }
        }
    }
}
