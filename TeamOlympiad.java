import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        List<Integer> listThree = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            if (t == 1) {
                listOne.add(i);
            } else if (t == 2) {
                listTwo.add(i);
            } else if (t == 3) {
                listThree.add(i);
            }
        }
        int w = findMin(listOne.size(), listTwo.size(), listThree.size());
        System.out.println(w);
        for (int j = 0; j < w; j++) {
            System.out.println(listOne.get(j) + " " + listTwo.get(j) + " " + listThree.get(j));
        }
    }

    public static int findMin(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
    }
}
