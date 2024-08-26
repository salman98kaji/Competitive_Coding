public class RotateMatrix {
    public static void main(String args[]) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int temp = matrix[0][1];
        matrix[0][1] = matrix[1][2];
        matrix[1][2] = matrix[2][1];
        matrix[2][1] = matrix[1][0];
        matrix[1][0] = temp;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
