import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int position = 0, step = 0;
        while (position < x) {
            position += 5;
            step++;
        }
        System.out.println(step);
    }
}
