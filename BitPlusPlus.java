import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            if (operation.contains("++")) {
                sum++;
            } else {
                sum--;
            }
        }
        System.out.println(sum);
    }
}
