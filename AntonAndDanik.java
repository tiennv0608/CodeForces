import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int anton = 0, danik = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                anton++;
            } else {
                danik++;
            }
        }
        String answer = anton > danik ? "Anton" : anton < danik ? "Danik" : "Friendship";
        System.out.println(answer);
    }
}
