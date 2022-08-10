import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            sum += p;
        }
        float answer = sum / (n * 100) * 100;
        System.out.println(answer);
    }
}
