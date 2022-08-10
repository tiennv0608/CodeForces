import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            List<Integer> listEven = new ArrayList<>();
            List<Integer> listOdd = new ArrayList<>();
            for (int j = 1; j <= n; j++) {
                arr[j - 1] = sc.nextInt();
                if (arr[j - 1] % 2 == j % 2) {
                    if (arr[j - 1] % 2 == 0) {
                        listEven.add(arr[j - 1]);
                    } else {
                        listOdd.add(arr[j - 1]);
                    }
                }
            }
            if (listEven.size() == listOdd.size()) {
                System.out.println(listEven.size());
            } else {
                System.out.println(-1);
            }
        }
    }
}
