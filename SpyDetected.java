import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int answer = 0;
            for (int j = 0; j < n - 2; j++) {
                if (arr[j] != arr[j + 1] && arr[j + 1] == arr[j + 2]) {
                    answer = j;
                    break;
                } else if (arr[j] != arr[j + 1] && arr[j + 1] != arr[j + 2]) {
                    answer = j + 1;
                    break;
                } else if (arr[j] == arr[j + 1] && arr[j + 1] != arr[j + 2]) {
                    answer = j + 2;
                    break;
                } else {
                    continue;
                }
            }
            System.out.println(answer + 1);
        }
    }
}
