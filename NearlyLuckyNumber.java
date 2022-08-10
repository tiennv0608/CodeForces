import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '4' || n.charAt(i) == '7') {
                count++;
            }
        }
        String answer = count == 4 || count == 7 ? "YES" : "NO";
        System.out.println(answer);
    }
}
