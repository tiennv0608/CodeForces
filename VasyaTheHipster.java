import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = (a < b) ? a : b;
        int same = (a < b) ? (b - a) / 2 : (a - b) / 2;
        System.out.println(diff + " " + same);
    }
}
