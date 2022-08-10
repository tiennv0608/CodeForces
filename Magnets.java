import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] magnets = new String[n];
        for (int i = 0; i < n; i++) {
            String m = sc.next();
            magnets[i] = m;
        }
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (!magnets[i].equals(magnets[i + 1])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
