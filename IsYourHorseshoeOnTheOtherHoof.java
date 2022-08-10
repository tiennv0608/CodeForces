import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        Set<Integer> sets = new HashSet<>();
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        sets.add(s4);
        System.out.println(4 - sets.size());
    }
}
