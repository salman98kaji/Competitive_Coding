import java.util.*;

public class frequency {
    public static void main(String args[]) {
        int arr[] = { 8, 1, 2, 5, 3, 5, 8 };
        int n = arr.length;
        countFrequency(arr, n);
    }

    private static void countFrequency(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println(arr[i] + ": " + count);
        }
    }
}
