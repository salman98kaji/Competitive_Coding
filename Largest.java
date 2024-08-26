public class Largest {
    // public static void main(String args[]) {
    // int arr[] = { 10, 12, 14, 16, 18, 56, 11 };
    // int max = arr[0];
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // }
    // System.out.println(max);
    // }

    // static int getMax(int arr[], int n) {
    // if (n == 1) {
    // return arr[0];
    // }
    // return Math.max(arr[n - 1], getMax(arr, n - 1));
    // }
    // public static void main(String args[]) {
    // int arr[] = { 10, 12, 14, 16, 18, 56, 11 };
    // int n = arr.length;
    // System.out.println(getMax(arr, n));
    // }

    public static void main(String args[]) {
        int arr[] = { 10, 12, 14, 16, 18, 56, 11 };
        int n = arr.length;
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.println(smallest);
        System.out.println(largest);

    }
}