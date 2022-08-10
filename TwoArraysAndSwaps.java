import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                arr2[j] = sc.nextInt();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int j = 0, f = n - 1; j < k; j++, f--) {
                if (arr1[j] < arr2[f]) {
                    int temp = arr1[j];
                    arr1[j] = arr2[f];
                    arr2[f] = temp;
                }
            }
            int sum = 0;
            for (int j : arr1) {
                sum += j;
            }
            System.out.println(sum);
        }
    }
}
