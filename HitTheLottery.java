import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = n % 100;
        int count = n / 100;
        if (mod == 0) {
            System.out.println(count);
        } else {
            count = count + mod / 20;
            mod = mod % 20;
            if (mod == 0) {
                System.out.println(count);
            } else {
                count = count + mod / 10;
                mod = mod % 10;
                if (mod == 0) {
                    System.out.println(count);
                } else {
                    count = count + mod / 5;
                    mod = mod % 5;
                    if (mod == 0) {
                        System.out.println(count);
                    } else {
                        count = count + mod;
                        System.out.println(count);
                    }
                }
            }
        }
    }
}
