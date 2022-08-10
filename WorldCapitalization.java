import java.util.Scanner;

public class WorldCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Character.toString(s.charAt(0)).toUpperCase() + s.substring(1));
    }
}
