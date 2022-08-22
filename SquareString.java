import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            String answer = isSquare(s) ? "YES" : "NO";
            System.out.println(answer);
        }
    }

    public static boolean isSquare(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
