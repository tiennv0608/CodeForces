import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestoreThePermutationByMerger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[2 * n];
            for (int j = 0; j < 2 * n; j++) {
                arr[j] = sc.nextInt();
            }
            List<Integer> results = new ArrayList<>();
            for (int j = 0; j < 2 * n; j++) {
                if (!results.contains(arr[j])) {
                    results.add(arr[j]);
                }
            }
            String answer = "";
            for (int j = 0; j < n; j++) {
                answer += results.get(j) + " ";
            }
            System.out.println(answer.trim());

        }
    }
}
