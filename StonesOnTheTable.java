import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else if (count != 0) {
                arr.add(count);
                count = 0;
            }
        }
        if (arr.size() == 0 || count != 0) {
            arr.add(count);
        }
        Collections.sort(arr);
        int answer = 0;
        if (arr.size() > 1) {
            for (int i : arr) {
                answer += i;
            }
        } else {
            answer = arr.get(0);
        }
        System.out.println(answer);
    }
}
