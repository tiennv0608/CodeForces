import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean isTranslation = true;
        if (s.length() != t.length()) {
            isTranslation = false;
        } else {
            for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
                if (s.charAt(i) != t.charAt(j)) {
                    isTranslation = false;
                    break;
                }
            }
        }
        String answer = isTranslation ? "YES" : "NO";
        System.out.println(answer);
    }
}
