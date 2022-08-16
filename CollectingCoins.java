import java.util.Arrays;
import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = { a, b, c };
            int n = sc.nextInt();
            Arrays.sort(arr);
            int remain = n - ((arr[2] - arr[1]) + (arr[2] - arr[0]));
            String answer = (remain >= 0 && remain % 3 == 0) ? "YES" : "NO";
            System.out.println(answer);
        }
    }
}
