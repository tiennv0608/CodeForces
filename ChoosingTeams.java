import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            if (y + k <= 5) {
                list.add(y);
            }
        }
        System.out.println(list.size() / 3);
    }
}
