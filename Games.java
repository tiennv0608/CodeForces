import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] homes = new int[n];
        int[] aways = new int[n];
        for (int i = 0; i < n; i++) {
            homes[i] = sc.nextInt();
            aways[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (homes[i] == aways[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
