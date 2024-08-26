//This code is designed to find and print symmetric pairs in a 2D array. A symmetric pair in this context means 
//that if the array contains a pair (a, b), then it should also contain the pair (b, a) to be considered symmetric.
//2nd loop :This loop starts from the next row (j = i + 1) and compares the current pair (arr[i][0], arr[i][1]) with all subsequent pairs in the array to check if they are symmetric.

public class symPairsIn2DArray {

    public static void main(String args[]) {
        int arr[][] = new int[5][2];

        arr[0][0] = 4;
        arr[0][1] = 2;
        arr[1][0] = 1;
        arr[1][1] = 5;
        arr[2][0] = 2;
        arr[2][1] = 4;
        arr[3][0] = 5;
        arr[3][1] = 1;
        arr[4][0] = 8;
        arr[4][1] = 9;

        for (int i = 0; i < 5; i++) {// This loop iterates over each row of the array, treating each row as a pair
                                     // (a, b).
            for (int j = i + 1; j < 5; j++) {
                if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.println("(" + arr[i][0] + "," + arr[i][1] + ")");
                }
            }
        }
    }
}
