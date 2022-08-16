import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrainPhotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<String> listColor = new ArrayList<>();
        for (int i = 0; i < n * m; i++) {
            String color = sc.next();
            if (color.equals("C") || color.equals("M") || color.equals("Y")) {
                listColor.add(color);
            }
        }
        String answer = listColor.size() != 0 ? "#Color" : "#Black&White";
        System.out.println(answer);
    }
}
