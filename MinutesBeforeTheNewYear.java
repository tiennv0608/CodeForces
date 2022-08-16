import java.util.Scanner;

public class MinutesBeforeTheNewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(60 - m + (23 - h) * 60);
        }
    }
}
