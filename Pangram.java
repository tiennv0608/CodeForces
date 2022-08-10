import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Set<Character> sets = new HashSet<>();
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            sets.add(str.charAt(i));
        }
        String answer = sets.size() == 26 ? "YES" : "NO";
        System.out.println(answer);
    }
}
