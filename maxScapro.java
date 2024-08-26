public class maxScapro {
    public static void main(String args[]) {
        int arr1[] = { 20, 40, 30, 10, 50 };
        int arr2[] = { 40, 80, 10, 5, 6 };
        int n = arr1.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr2[i] > arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        int product = 0;
        for (int i = 0; i < n; i++) {
            product = product + arr1[i] * arr2[i];
        }

        System.out.println(product);
    }
}
