import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int countLower = 0, countUpper = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                countLower++;
            } else {
                countUpper++;
            }
        }
        String answer = (countLower >= countUpper) ? s.toLowerCase() : s.toUpperCase();
        System.out.println(answer);
    }
}
