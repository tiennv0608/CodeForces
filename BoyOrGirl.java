import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String[] str = username.split("");
        Map<String, Integer> maps = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (maps.containsKey(str[i])) {
                int value = maps.get(str[i]);
                maps.put(str[i], value + 1);
            } else {
                maps.put(str[i], 1);
            }
        }
        String answer = (maps.size() % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!";
        System.out.println(answer);
    }
}
