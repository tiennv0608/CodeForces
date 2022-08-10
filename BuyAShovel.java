import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int i = 1;
        for (; i <= 10; i++) {
            if ((k * i) % 10 == 0) {
                break;
            } else if (((k * i) - r) % 10 == 0) {
                break;
            }
        }
        System.out.println(i);
    }
}
