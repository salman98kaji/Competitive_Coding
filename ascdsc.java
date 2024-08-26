import java.util.*;

public class ascdsc {
    public static void main(String args[]) {
        int arr[] = { 5, 1, 4, 2, 3, 40, 10, 50, 20, 30 };
        int n = arr.length;
        testCase(arr, n);
        // Arrays.sort(arr);
        // for (int i = 0; i < n / 2; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // for (int j = n - 1; j >= n / 2; j--) {
        // System.out.print(arr[j] + " ");
        // }

    }

    public static void testCase(int arr[], int n) {

        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int j = n / 2; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
