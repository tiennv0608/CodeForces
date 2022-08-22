import java.util.Scanner;

public class SpecialPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = j + 2;
            }
            arr[n - 1] = 1;
            String answer = "";
            for (int j = 0; j < n; j++) {
                answer += arr[j] + " ";
            }
            System.out.println(answer.trim());
        }
    }
}
