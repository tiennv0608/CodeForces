import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            String answer = "";
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (n == 1) {
                answer = "YES";
            } else {
                for (int j = 0; j < n - 1; j++) {
                    if (Math.abs(arr[j] - arr[j + 1]) > 1) {
                        answer = "NO";
                        break;
                    } else {
                        answer = "YES";
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
