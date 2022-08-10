import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        int[] arr = { x1, x2, x3, x4 };
        Arrays.sort(arr);
        int c = (arr[2] + arr[1] - arr[0]) / 2;
        int a = arr[1] - c;
        int b = arr[0] - a;
        System.out.println(a + " " + b + " " + c);
    }
}
