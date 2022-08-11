import java.util.Scanner;

public class BachgoldProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n >= 4) {
            n -= 2;
            count++;
        }
        System.out.println(count + 1);
        for (int i = 0; i < count; i++) {
            System.out.print(2 + " ");
        }
        System.out.print(n);
    }
}
