import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min = Math.abs(arr[0] - arr[1]);
            for (int j = 1; j < arr.length - 1; j++) {
                if (Math.abs(arr[j] - arr[j + 1]) < min) {
                    min = Math.abs(arr[j] - arr[j + 1]);
                }
            }
            System.out.println(min);
        }
    }
}
