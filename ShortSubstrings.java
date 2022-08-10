import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String a = sc.nextLine();
            String answer = "";
            for (int j = 0; j < a.length(); j += 2) {
                answer += a.charAt(j);
            }
            answer += a.charAt(a.length() - 1);
            System.out.println(answer);
        }
    }
}
