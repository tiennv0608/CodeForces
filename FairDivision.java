import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Integer> listOne = new ArrayList<>();
            List<Integer> listSecond = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    listOne.add(a);
                } else {
                    listSecond.add(a);
                }
            }
            String answer = "";
            if (listOne.size() == 0) {
                if (listSecond.size() % 2 == 0) {
                    answer = "YES";
                } else {
                    answer = "NO";
                }
            } else if (listOne.size() % 2 == 0) {
                answer = "YES";
            } else {
                answer = "NO";
            }
            System.out.println(answer);
        }
    }
}
