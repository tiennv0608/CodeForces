import java.util.Arrays;
import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int[] arr = new int[4];
            int[] arr2 = new int[4];
            for (int j = 0; j < 4; j++) {
                arr[j] = sc.nextInt();
                arr2[j] = arr[j];
            }
            Arrays.sort(arr2);
            int first = findIndex(arr, arr2[3]);
            int second = findIndex(arr, arr2[2]);
            String answer = ((first == 0 || first == 1) && (second == 2 || second == 3))
                    || ((second == 0 || second == 1) && (first == 2 || first == 3)) ? "YES" : "NO";
            System.out.println(answer);
        }
    }

    public static int findIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
