import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> sets = new HashSet<>();
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            int a = sc.nextInt();
            sets.add(a);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            sets.add(a);
        }
        if (sets.size() != n) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}
