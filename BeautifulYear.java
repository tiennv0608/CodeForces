import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        for (y += 1; y < Integer.MAX_VALUE; y++) {
            if (isBeautyfulYear(y)) {
                break;
            }
        }
        System.out.println(y);
    }

    public static boolean isBeautyfulYear(int n) {
        int a, b, c, d;
        a = n % 10;
        n /= 10;
        b = n % 10;
        n /= 10;
        c = n % 10;
        n /= 10;
        d = n % 10;
        n /= 10;
        if (a == b || a == c || a == d || b == c || b == d || c == d)
            return false;
        return true;
    }
}
