import java.util.Scanner;

public class MostUnstableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int answer = n == 1 ? 0 : n == 2 ? m : 2 * m;
            System.out.println(answer);
        }
    }
}
