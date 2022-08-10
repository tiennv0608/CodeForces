import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gifts = new int[n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            gifts[p - 1] = i;
        }
        for (int i : gifts) {
            System.out.print((i + 1) + " ");
        }
    }
}
