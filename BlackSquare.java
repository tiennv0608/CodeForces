import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        String s = sc.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = Character.getNumericValue(s.charAt(i));
            sum += arr[index - 1];
        }
        System.out.println(sum);
    }
}
