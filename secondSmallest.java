import java.util.*;

public class secondSmallest {

    static int getSecSmall(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return Integer.MAX_VALUE;
        }
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return arr[i];
            }
        }
        System.out.println("ALl elements are same");
        return Integer.MAX_VALUE;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 8, 7, 1, 4 };
        System.out.println("smallest number is : " + getSecSmall(arr));
    }
}
