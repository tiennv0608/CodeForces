import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = 0;
        int i = 1;
        int sum = 0;
        int cubes = 0;
        while (cubes <= n) {
            sum += i;
            cubes += sum;
            i++;
            height++;
        }
        System.out.println(height - 1);
    }
}
