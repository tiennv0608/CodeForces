import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> sets = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                sets.add(s.charAt(i));
            }
        }
        System.out.println(sets.size());
    }
}
