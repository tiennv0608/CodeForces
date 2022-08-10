import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int officiers = 0;
        int crimes = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < 0) {
                if (officiers > 0) {
                    officiers += a;
                } else {
                    crimes += a;
                }
            } else {
                officiers += a;
            }
        }
        System.out.println(Math.abs(crimes));
    }
}
