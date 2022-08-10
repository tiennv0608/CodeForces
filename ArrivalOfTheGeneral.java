import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int indexMax = 0, indexMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[indexMax] < arr[i]) {
                indexMax = i;
            }
            if (arr[indexMin] >= arr[i]) {
                indexMin = i;
            }
        }
        int answer = (indexMax > indexMin) ? indexMax + (arr.length - 1) - indexMin - 1
                : indexMax + (arr.length - 1) - indexMin;
        System.out.println(answer);
    }
}
