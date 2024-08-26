public class RotateMatrix1 {

    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        if (n < 2) {
            System.out.print("Matric too small to rotate boundary elements");
        }

        int[] topBoundary = new int[n - 2];
        for (int i = 1; i < n - 1; i++) {
            topBoundary[i - 1] = matrix[0][i];
        }

        for (int i = 1; i < n - 1; i++) {
            matrix[0][i] = matrix[i][n - 1];
        }

        for (int i = 1; i < n - 1; i++) {
            matrix[i][n - 1] = matrix[n - 1][i];
        }

        for (int i = 1; i < n - 1; i++) {
            matrix[n - 1][i] = matrix[i][0];
        }

        for (int i = 1; i < n - 1; i++) {
            matrix[n - 1 - i][0] = topBoundary[i - 1];
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println("Matrix before rotation");
        printMatrix(matrix);
        
        System.out.println("matrix after rotation");
        rotateMatrix(matrix);
        printMatrix(matrix);
    }
}
