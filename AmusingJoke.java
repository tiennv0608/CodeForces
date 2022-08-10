import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String[] str1 = s1.split("");
        String[] str2 = s2.split("");
        String[] str3 = s3.split("");
        String[] str4 = new String[str1.length + str2.length];
        for (int i = 0; i < str1.length; i++) {
            str4[i] = str1[i];
        }
        for (int i = 0; i < str2.length; i++) {
            str4[i + str1.length] = str2[i];
        }
        Arrays.sort(str3);
        Arrays.sort(str4);
        if (str3.length != str4.length) {
            System.out.println("NO");
            System.exit(0);
        }
        for (int i = 0; i < str3.length; i++) {
            if (!str3[i].equals(str4[i])) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
