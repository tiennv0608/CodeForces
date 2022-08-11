import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mishka = 0, chris = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int c = sc.nextInt();
            if (m > c) {
                mishka++;
            } else if (m < c) {
                chris++;
            }
        }
        String answer = (mishka > chris) ? "Mishka" : (mishka < chris) ? "Chris" : "Friendship is magic!^^";
        System.out.println(answer);
    }
}
