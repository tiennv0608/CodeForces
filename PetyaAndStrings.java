import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        int ans = (first.compareToIgnoreCase(second) < 0) ? -1 : (first.compareToIgnoreCase(second) > 0) ? 1 : 0;
        System.out.println(ans);
    }
}
