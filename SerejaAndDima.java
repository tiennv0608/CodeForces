import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isPlayer1 = true, isPlayer2 = false;
        int sum1 = 0, sum2 = 0;
        for (int i = 0, j = arr.length - 1; i <= j;) {
            if (isPlayer1) {
                if (arr[i] > arr[j]) {
                    sum1 += arr[i];
                    i++;
                } else {
                    sum1 += arr[j];
                    j--;
                }
                isPlayer1 = false;
                isPlayer2 = true;
            } else {
                if (arr[i] > arr[j]) {
                    sum2 += arr[i];
                    i++;
                } else {
                    sum2 += arr[j];
                    j--;
                }
                isPlayer1 = true;
                isPlayer2 = false;
            }
        }
        System.out.println(sum1 + " " + sum2);
    }
}
