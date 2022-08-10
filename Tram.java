import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passenger = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            passenger = passenger - a + b;
            list.add(passenger);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
    }
}
