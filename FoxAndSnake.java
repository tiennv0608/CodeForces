import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean isFirst = true;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                if (isFirst) {
                    for (int j = 0; j < m; j++) {
                        if (j == m - 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                    isFirst = false;
                } else {
                    for (int j = 0; j < m; j++) {
                        if (j == 0) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                    isFirst = true;
                }
            } else {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
