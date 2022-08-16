import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int y = sc.nextInt();
        int larger = (w > y) ? w : y;
        int chance = 6 - larger + 1;
        int gcd = 1;
        for (int i = 1; i <= 6; i++) {
            if (6 % i == 0 && chance % i == 0) {
                gcd = i;
            }
        }
        System.out.println((chance / gcd) + "/" + (6 / gcd));
    }
}
