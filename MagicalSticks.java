import java.util.Scanner;

public class MagicalSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int answer = (n % 2 == 0) ? n / 2 : n / 2 + 1;
            System.out.println(answer);
        }
    }
}
