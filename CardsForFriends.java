import java.util.Scanner;

public class CardsForFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            int card = 1;
            while (w % 2 == 0) {
                w /= 2;
                card *= 2;
            }
            while (h % 2 == 0) {
                h /= 2;
                card *= 2;
            }
            String answer = card >= n ? "YES" : "NO";
            System.out.println(answer);
        }
    }
}
