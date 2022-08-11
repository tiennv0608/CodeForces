import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                answer += "0";
            } else if (s.charAt(i + 1) == '.') {
                answer += "1";
                i++;
            } else {
                answer += "2";
                i++;
            }
        }
        System.out.println(answer);
    }
}
