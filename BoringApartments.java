import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int mod = n % 10;
            String number = String.valueOf(n);
            int answer = (number.length() == 1) ? (mod - 1) * 10 + 1
                    : (number.length() == 2) ? (mod - 1) * 10 + 3
                            : (number.length() == 3) ? (mod - 1) * 10 + 6 : mod * 10;
            System.out.println(answer);
        }
    }
}
