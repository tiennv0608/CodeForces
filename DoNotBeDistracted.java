import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean isSuspicious = true;
            Map<Character, Integer> maps = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (maps.get(s.charAt(j)) == null) {
                    maps.put(s.charAt(j), j);
                } else {
                    int index = maps.get(s.charAt(j));
                    if (index == j - 1) {
                        maps.put(s.charAt(j), j);
                    } else {
                        isSuspicious = false;
                        break;
                    }
                }
            }
            String answer = isSuspicious ? "YES" : "NO";
            System.out.println(answer);
        }
    }
}
