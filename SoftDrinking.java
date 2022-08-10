import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int x = k * l / nl;
        int y = c * d;
        int z = p / np;
        System.out.println(findMin(x, y, z) / n);
    }

    public static int findMin(int x, int y, int z) {
        if (x > y) {
            if (y > z) {
                return z;
            } else {
                return y;
            }
        } else {
            if (x > z) {
                return z;
            } else {
                return x;
            }
        }
    }
}
