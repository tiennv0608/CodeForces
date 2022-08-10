import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InsomniaCure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        Set<Integer> sets = new HashSet<>();
        for (int i = 1; i <= d; i++) {
            if (i % k == 0)
                sets.add(i);
            else if (i % l == 0)
                sets.add(i);
            else if (i % m == 0)
                sets.add(i);
            else if (i % n == 0)
                sets.add(i);
        }
        System.out.println(sets.size());
    }
}
