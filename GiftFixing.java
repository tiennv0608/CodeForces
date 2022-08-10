import java.util.Scanner;

public class GiftFixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long[] arr1 = new long[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = sc.nextInt();
            }
            long[] arr2 = new long[n];
            for (int j = 0; j < n; j++) {
                arr2[j] = sc.nextInt();
            }
            int minIndex1 = findIndex(arr1);
            int minIndex2 = findIndex(arr2);

            long count = 0, minNum = 0;
            for (int j = 0; j < n; j++) {
                if (arr1[j] > arr1[minIndex1] && arr2[j] > arr2[minIndex2]) {
                    minNum = findMin(arr1[j], arr2[j]);
                    arr1[j] = arr1[j] - (minNum - findMin(arr1[minIndex1], arr2[minIndex2]));
                    arr2[j] = arr2[j] - (minNum - findMin(arr1[minIndex1], arr2[minIndex2]));
                    count += minNum - findMin(arr1[minIndex1], arr2[minIndex2]);
                    if (arr1[j] > arr1[minIndex1]) {
                        count += arr1[j] - arr1[minIndex1];
                        arr1[j] -= arr1[j] - arr1[minIndex1];
                    } else if (arr2[j] > arr2[minIndex2]) {
                        count += arr2[j] - arr2[minIndex2];
                        arr2[j] -= arr2[j] - arr2[minIndex2];
                    }
                } else if (arr1[j] == arr1[minIndex1] && arr2[j] > arr2[minIndex2]) {
                    count += arr2[j] - arr2[minIndex2];
                    arr2[j] -= arr2[j] - arr2[minIndex2];
                } else if (arr1[j] > arr1[minIndex1] && arr2[j] == arr2[minIndex2]) {
                    count += arr1[j] - arr1[minIndex1];
                    arr1[j] -= arr1[j] - arr1[minIndex1];
                }
            }
            System.out.println(count);
        }
    }

    public static int findIndex(long[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static long findMin(long a, long b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
