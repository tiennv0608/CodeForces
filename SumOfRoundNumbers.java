import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            String number = String.valueOf(n);
            String answer = "";
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) != '0') {
                    answer += number.charAt(j);
                    for (int k = number.length() - 1; k > j; k--) {
                        answer += '0';
                    }
                    answer += " ";
                    count++;
                }
            }
            System.out.println(count);
            System.out.println(answer.trim());
        }
    }
}
