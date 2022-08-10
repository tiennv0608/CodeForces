import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int indexMax = 0, indexMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[indexMax] < arr[i]) {
                indexMax = i;
                count++;
            }
            if (arr[indexMin] > arr[i]) {
                indexMin = i;
                count++;
            }
        }
        System.out.println(count);
    }
}
