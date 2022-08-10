import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] digits = s.split("\\+");
        Arrays.sort(digits);
        for (int i = 0; i < digits.length; i++) {
            if (i != digits.length - 1) {
                System.out.print(digits[i] + "+");
            } else {
                System.out.print(digits[i]);
            }
        }
    }
}
