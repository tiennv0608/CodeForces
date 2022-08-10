import java.util.Scanner;

public class DesignTutorialLearnFromMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        for (; i <= n / 2; i++) {
            if (!isPrime(i) && !isPrime(n - i)) {
                break;
            }
        }
        System.out.println(i + " " + (n - i));
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
