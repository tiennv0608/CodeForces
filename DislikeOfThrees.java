import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int count = 0;
            List<Integer> list = new ArrayList<>();
            while (list.size() != k) {
                String number = String.valueOf(count);
                if (!Character.toString(number.charAt(number.length() - 1)).equals("3") && count % 3 != 0) {
                    list.add(count);
                }
                count++;
            }
            System.out.println(list.get(k - 1));
        }
    }
}
