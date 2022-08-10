import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isHard = false;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                isHard = true;
            }
        }
        String answer = isHard ? "HARD" : "EASY";
        System.out.println(answer);
    }
}
