import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer += "I hate ";
            } else {
                answer += "I love ";
            }
            if (i == n) {
                answer += "it";
            } else {
                answer += "that ";
            }
        }
        System.out.println(answer);
    }
}
