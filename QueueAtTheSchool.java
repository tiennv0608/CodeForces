import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        String[] str = s.split("");
        while (t > 0) {
            for (int i = 1; i < s.length(); i++) {
                if (str[i].equals("G") && str[i - 1].equals("B")) {
                    str[i] = "B";
                    str[i - 1] = "G";
                    ++i;
                }
            }
            t--;
        }
        for (String st : str) {
            System.out.print(st);
        }
    }
}
