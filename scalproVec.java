public class scalproVec {
    public static void main(String args[]) {
        int arr1[] = { 2, 1, 4, 3, 5 };
        int arr2[] = { 6, 10, 9, 7, 8 };
        int n = arr1.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr2[i] < arr2[j]) {
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

// minimum scalar product of two vectors in array
// Sort the first array in ascending order,
// Sort the second array in descending order.
// Declare a variable say product = 0.
// Run a loop from index 0 to n
// Set product += (arrr1[i]*arr2[i])
// After complete iteration print product.
