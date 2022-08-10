import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (word.length() <= 10) {
                System.out.println(word);
            } else
                System.out.println(Character.toString(word.charAt(0)) + (word.length() - 2)
                        + Character.toString(word.charAt(word.length() - 1)));
        }
    }
}
